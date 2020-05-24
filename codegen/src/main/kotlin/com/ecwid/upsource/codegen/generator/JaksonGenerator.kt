package com.ecwid.upsource.codegen.generator

import com.ecwid.upsource.codegen.SERIALIZER_PACKAGE
import com.ecwid.upsource.codegen.TypeMapping
import com.ecwid.upsource.codegen.filewriter.FileWriter
import com.ecwid.upsource.codegen.schema.EnumType
import com.ecwid.upsource.codegen.schema.UpsourceFile
import com.ecwid.upsource.codegen.templates.Template
import com.ecwid.upsource.codegen.templates.Templates

class JaksonGenerator(
	private val libraryDir: String,
	private val fileWriter: FileWriter,
	private val templates: Templates
) : FilesGenerator {
	override fun processFiles(files: List<UpsourceFile>, typeMapping: TypeMapping) {
		super.processFiles(files, typeMapping)
		createJaksonModule(files, typeMapping)
	}

	override fun processFile(file: UpsourceFile, typeMapping: TypeMapping) {
		val filePackage = file.fullPackage

		file.schema.enums.forEach { enum ->
			val fileName = "${enum.name}.kt"
			val content = buildContent(filePackage, enum)
			fileWriter.writeFile(
				dir = libraryDir,
				filePackage = filePackage,
				filename = fileName,
				content = content
			)
		}
	}

	private fun buildContent(filePackage: String, enum: EnumType): String {
		val template = Template.JaksonEnumTemplate(
			filePackage = filePackage,
			enum = enum
		)

		return templates.render(template)
	}

	private fun createJaksonModule(files: List<UpsourceFile>, typeMapping: TypeMapping) {
		val enums = files
			.flatMap { file ->
				file.schema.enums.map { it.name }
			}
			.sortedBy { it }

		val imports = files
			.flatMap { file ->
				file.schema.enums
			}
			.mapNotNull { typeMapping.findPackage(it.name) }
			.distinct()
			.map { "$it.*" }
			.sortedBy { it }

		val filePackage = "$SERIALIZER_PACKAGE.jakson"
		val template = Template.JaksonModuleTemplate(
			filePackage = filePackage,
			enums = enums,
			imports = imports
		)

		val content = templates.render(template)

		val fileName = "UpsourceModule.kt"
		fileWriter.writeFile(
			dir = libraryDir,
			filePackage = filePackage,
			filename = fileName,
			content = content
		)
	}

}
