package com.ecwid.upsource.codegen.generator

import com.ecwid.upsource.codegen.*
import com.ecwid.upsource.codegen.filewriter.FileWriter
import com.ecwid.upsource.codegen.schema.Service
import com.ecwid.upsource.codegen.schema.UpsourceFile
import com.ecwid.upsource.codegen.templates.Template
import com.ecwid.upsource.codegen.templates.Templates

class ServicesGenerator(
	private val config: Config,
	private val fileWriter: FileWriter,
	private val templates: Templates
) : FilesGenerator {
	override fun processFiles(files: List<UpsourceFile>, typeMapping: TypeMapping) {
		super.processFiles(files, typeMapping)

		createClientFactory(files)
	}

	override fun processFile(file: UpsourceFile, typeMapping: TypeMapping) {
		val filePackage = RPC_PACKAGE
		val implPackage = RPC_IMPL_PACKAGE

		file.schema.services.forEach { service ->
			val normalizedService = normalizeService(
				filePackage = filePackage,
				service = service,
				typeMapping = typeMapping
			)

			val normalizedServiceImpl = normalizeService(
				filePackage = implPackage,
				service = service,
				typeMapping = typeMapping
			)

			createService(filePackage, normalizedService)
			createServiceImpl(implPackage, normalizedServiceImpl)
		}
	}

	private fun createService(filePackage: String, service: Service) {
		val fileName = "${service.name}.kt"
		val content = buildServiceContent(filePackage, service)
		fileWriter.writeFile(
			dir = config.clientDir,
			filePackage = filePackage,
			filename = fileName,
			content = content
		)
	}

	private fun buildServiceContent(filePackage: String, service: Service): String {
		val template = Template.ServiceTemplate(
			filePackage = filePackage,
			transportPackage = TRANSPORT_PACKAGE,
			service = service
		)
		return templates.render(template)
	}

	private fun createServiceImpl(filePackage: String, service: Service) {
		val fileName = "${service.name}Impl.kt"
		val content = buildServiceImplContent(filePackage, service)
		fileWriter.writeFile(
			dir = config.clientDir,
			filePackage = filePackage,
			filename = fileName,
			content = content
		)
	}

	private fun buildServiceImplContent(filePackage: String, service: Service): String {
		val template = Template.ServiceImplTemplate(
			filePackage = filePackage,
			transportPackage = TRANSPORT_PACKAGE,
			rpcPackage = RPC_PACKAGE,
			serializerPackage = SERIALIZER_PACKAGE,
			service = service
		)
		return templates.render(template)
	}

	private fun normalizeService(filePackage: String, service: Service, typeMapping: TypeMapping): Service {
		val normalizedMethods = service.methods.map {
			it.copy(
				argumentType = normalizeType(it.argumentType, filePackage, typeMapping),
				returnType = normalizeType(it.returnType, filePackage, typeMapping)
			)
		}

		return service.copy(
			methods = normalizedMethods
		)
	}

	private fun normalizeType(type: String, filePackage: String, typeMapping: TypeMapping): String {
		val cleanName = type.removePrefix("messages.")
		val typePackage = typeMapping.findPackage(cleanName)

		if (typePackage != null && typePackage != filePackage) {
			return "$typePackage.$cleanName"
		}

		return cleanName
	}

	private fun createClientFactory(files: List<UpsourceFile>) {
		val services = files
			.flatMap {
				it.schema.services
			}
			.sortedBy { it.name }

		if (services.isEmpty()) {
			return
		}

		val template = Template.ClientFactoryTemplate(
			filePackage = ROOT_PACKAGE,
			rpcPackage = RPC_PACKAGE,
			services = services
		)

		val content = templates.render(template)

		fileWriter.writeFile(
			dir = config.clientDir,
			filePackage = ROOT_PACKAGE,
			filename = "ClientFactory.kt",
			content = content
		)
	}
}
