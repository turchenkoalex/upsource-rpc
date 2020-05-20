package com.ecwid.upsource.codegen.generator

import com.ecwid.upsource.codegen.Config
import com.ecwid.upsource.codegen.TypeMapping
import com.ecwid.upsource.codegen.filewriter.FileWriter
import com.ecwid.upsource.codegen.schema.EnumType
import com.ecwid.upsource.codegen.schema.UpsourceFile
import com.ecwid.upsource.codegen.templates.Template
import com.ecwid.upsource.codegen.templates.Templates

class EnumsGenerator(
	private val config: Config,
	private val fileWriter: FileWriter,
	private val templates: Templates
) : FilesGenerator {
	override fun processFile(file: UpsourceFile, typeMapping: TypeMapping) {
		val filePackage = file.fullPackage

		file.schema.enums.forEach { enum ->
			val fileName = "${enum.name}.kt"
			val content = buildContent(filePackage, enum)
			fileWriter.writeFile(
				dir = config.clientDir,
				filePackage = filePackage,
				filename = fileName,
				content = content
			)
		}
	}

	private fun buildContent(filePackage: String, enumType: EnumType): String {
		val template = Template.EnumTemplate(
			filePackage = filePackage,
			enum = enumType
		)
		return templates.render(template)
	}

}
