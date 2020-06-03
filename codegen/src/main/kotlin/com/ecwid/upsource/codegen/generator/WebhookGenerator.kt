package com.ecwid.upsource.codegen.generator

import com.ecwid.upsource.codegen.TypeMapping
import com.ecwid.upsource.codegen.WEBHOOKS_PACKAGE
import com.ecwid.upsource.codegen.filewriter.FileWriter
import com.ecwid.upsource.codegen.schema.UpsourceFile
import com.ecwid.upsource.codegen.templates.Template
import com.ecwid.upsource.codegen.templates.Templates

class WebhookGenerator(
	private val libraryDir: String,
	private val fileWriter: FileWriter,
	private val templates: Templates
) : FilesGenerator {
	override fun processFiles(files: List<UpsourceFile>, typeMapping: TypeMapping) {
		super.processFiles(files, typeMapping)
		createWebhookFile(files, typeMapping)
	}

	private fun createWebhookFile(
		files: List<UpsourceFile>,
		typeMapping: TypeMapping
	) {
		val types = files
			.flatMap { file ->
				file.schema.messages.map { it.name }
			}
			.sortedBy { it }

		val imports = files
			.flatMap { file ->
				file.schema.messages
			}
			.mapNotNull { typeMapping.findPackage(it.name) }
			.distinct()
			.map { "$it.*" }
			.sortedBy { it }

		fileWriter.writeFile(
			dir = libraryDir,
			filePackage = WEBHOOKS_PACKAGE,
			filename = "Webhook.kt",
			content = templates.render(
				Template.WebhookTemplate(
					filePackage = WEBHOOKS_PACKAGE,
					types = types,
					imports = imports
				)
			)
		)

		fileWriter.writeFile(
			dir = libraryDir,
			filePackage = "$WEBHOOKS_PACKAGE.jackson",
			filename = "JacksonWebhookParser.kt",
			content = templates.render(
				Template.JacksonWebhookParserTemplate(
					filePackage = "$WEBHOOKS_PACKAGE.jackson",
					types = types,
					imports = imports
				)
			)
		)
	}

	override fun processFile(file: UpsourceFile, typeMapping: TypeMapping) {
		// nothing
	}

}
