package com.ecwid.upsource.codegen.generator

import com.ecwid.upsource.codegen.Config
import com.ecwid.upsource.codegen.TypeMapping
import com.ecwid.upsource.codegen.filewriter.FileWriter
import com.ecwid.upsource.codegen.schema.UpsourceFile
import com.ecwid.upsource.codegen.templates.Templates
import java.util.logging.Logger

private val log = Logger.getLogger(CodeGenerator::class.qualifiedName)

class CodeGenerator(
	config: Config,
	templates: Templates,
	fileWriter: FileWriter
) {
	private val fileGenerators = listOf(
		EnumsGenerator(config, fileWriter, templates),
		MessagesGenerator(config, fileWriter, templates),
		ServicesGenerator(config, fileWriter, templates),
		GsonTypeAdapterGenerator(config, fileWriter, templates)
	)

	fun generate(files: List<UpsourceFile>) {
		val typeMapping = TypeMapping(files)

		fileGenerators.forEach {
			it.processFiles(files, typeMapping)
		}
	}

}
