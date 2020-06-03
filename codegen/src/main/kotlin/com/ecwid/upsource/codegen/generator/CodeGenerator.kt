package com.ecwid.upsource.codegen.generator

import com.ecwid.upsource.codegen.Config
import com.ecwid.upsource.codegen.TypeMapping
import com.ecwid.upsource.codegen.filewriter.FileWriter
import com.ecwid.upsource.codegen.schema.UpsourceFile
import com.ecwid.upsource.codegen.templates.Templates

class CodeGenerator(
	config: Config,
	templates: Templates,
	fileWriter: FileWriter
) {
	private val clientGenerators = listOf(
		EnumsGenerator(config.clientDir, fileWriter, templates),
		MessagesGenerator(config.clientDir, fileWriter, templates),
		ServicesGenerator(config, fileWriter, templates),
		GsonGenerator(config.gsonLibraryDir, fileWriter, templates),
		JacksonGenerator(config.jacksonLibraryDir, fileWriter, templates)
	)

	private val webhookGenerators = listOf(
		EnumsGenerator(config.webhooksDir, fileWriter, templates),
		MessagesGenerator(config.webhooksDir, fileWriter, templates),
		WebhookGenerator(config.webhooksDir, fileWriter, templates)
	)

	fun generateClient(files: List<UpsourceFile>) {
		val typeMapping = TypeMapping(files)

		clientGenerators.forEach {
			it.processFiles(files, typeMapping)
		}
	}

	fun generateWebhook(files: List<UpsourceFile>) {
		val typeMapping = TypeMapping(files)

		webhookGenerators.forEach {
			it.processFiles(files, typeMapping)
		}
	}

}
