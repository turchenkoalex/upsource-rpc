package com.ecwid.upsource.codegen

import com.ecwid.upsource.codegen.filewriter.FileWriter
import com.ecwid.upsource.codegen.generator.CodeGenerator
import com.ecwid.upsource.codegen.resources.Resources
import com.ecwid.upsource.codegen.templates.Templates
import java.util.logging.Logger

abstract class GeneratorRunner(
	private val clientJsonFiles: List<String>,
	private val webhooksJsonFiles: List<String>
) {
	protected val log: Logger = Logger.getLogger("codegen")

	protected abstract val fileWriter: FileWriter
	protected abstract fun processResults(fileWriter: FileWriter)

	fun run(config: Config) {
		log.info("Start generator with config $config")

		val codeGenerator = CodeGenerator(
            config = config,
            templates = Templates(),
            fileWriter = fileWriter
        )

		generateClient(codeGenerator)
		processResults(fileWriter)
	}

	/**
	 * Add upsource schema files to generator and generate clients
	 */
	private fun generateClient(codeGenerator: CodeGenerator) {
		val upsourceFileLoader = UpsourceFileLoader(Resources())
		val clientFiles = clientJsonFiles.map(upsourceFileLoader::loadUpsourceFile)
		val webhooksFiles = webhooksJsonFiles.map(upsourceFileLoader::loadUpsourceFile)

		codeGenerator.generateClient(clientFiles)
		codeGenerator.generateWebhook(webhooksFiles)
	}

}
