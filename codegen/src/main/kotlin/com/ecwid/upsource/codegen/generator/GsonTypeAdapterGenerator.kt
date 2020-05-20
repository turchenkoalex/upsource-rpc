package com.ecwid.upsource.codegen.generator

import com.ecwid.upsource.codegen.*
import com.ecwid.upsource.codegen.filewriter.FileWriter
import com.ecwid.upsource.codegen.schema.EnumType
import com.ecwid.upsource.codegen.schema.UpsourceFile
import com.ecwid.upsource.codegen.templates.Template
import com.ecwid.upsource.codegen.templates.Templates

class GsonTypeAdapterGenerator(
	private val config: Config,
	private val fileWriter: FileWriter,
	private val templates: Templates
) : FilesGenerator {
	override fun processFiles(files: List<UpsourceFile>, typeMapping: TypeMapping) {
		super.processFiles(files, typeMapping)

		createGenericGsonBuilder(files, typeMapping)
	}

	override fun processFile(file: UpsourceFile, typeMapping: TypeMapping) {
		val filePackage = file.fullPackage

		file.schema.enums.forEach { enum ->
			val fileName = "${enum.name}TypeAdapter.kt"
			val content = buildContent(filePackage, enum, typeMapping)
			fileWriter.writeFile(
				dir = config.gsonLibraryDir,
				filePackage = filePackage,
				filename = fileName,
				content = content
			)
		}
	}

	private fun buildContent(filePackage: String, enum: EnumType, typeMapping: TypeMapping): String {
		val typePackage = typeMapping.findPackage(enum.name)
		val imports = if (typePackage != filePackage) {
			listOf("$typePackage.${enum.name}")
		} else {
			emptyList()
		}

		val template = Template.EnumGsonTypeAdapterTemplate(
			filePackage = filePackage,
			imports = imports,
			enum = enum
		)

		return templates.render(template)
	}

	private fun createGenericGsonBuilder(files: List<UpsourceFile>, typeMapping: TypeMapping) {
		val enums = files
			.flatMap {
				it.schema.enums
			}
			.sortedBy { it.name }

		if (enums.isEmpty()) {
			return
		}

		val filePackage = SERIALIZER_PACKAGE
		val filename = "GenericGsonBuilder.kt"
		val content = buildGenericGsonBuilder(
			filePackage = filePackage,
			enums = enums,
			typeMapping = typeMapping
		)
		fileWriter.writeFile(
			dir = config.gsonLibraryDir,
			filePackage = filePackage,
			filename = filename,
			content = content
		)
	}

	private fun buildGenericGsonBuilder(filePackage: String, enums: List<EnumType>, typeMapping: TypeMapping): String {
		val types = enums.map {
			val typePackage = typeMapping.findPackage(it.name)
			"$typePackage.${it.name}"
		}

		val template = Template.GenericGsonBuilderTemplate(
			filePackage = filePackage,
			types = types
		)

		return templates.render(template)
	}


}
