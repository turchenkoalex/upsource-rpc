package com.ecwid.upsource.codegen

import com.ecwid.upsource.codegen.filewriter.DryRunFileWriter
import com.ecwid.upsource.codegen.filewriter.FileWriter
import kotlin.system.exitProcess

class DryRunGeneratorRunner(
	clientJsonFiles: List<String>,
	webhooksJsonFiles: List<String>
) : GeneratorRunner(clientJsonFiles, webhooksJsonFiles) {
	private val dryRunFileWriter = DryRunFileWriter()
	override val fileWriter: DryRunFileWriter = dryRunFileWriter

	override fun processResults(fileWriter: FileWriter) {
		if (dryRunFileWriter.hasChanges()) {
			log.warning("Dry run failed:")
			log.warning(dryRunFileWriter.report())
			exitProcess(1)
		} else {
			log.info("No changes detected")
		}
	}
}
