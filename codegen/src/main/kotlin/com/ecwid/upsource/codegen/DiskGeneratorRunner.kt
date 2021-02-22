package com.ecwid.upsource.codegen

import com.ecwid.upsource.codegen.filewriter.DiskFileWriter
import com.ecwid.upsource.codegen.filewriter.FileWriter

class DiskGeneratorRunner(
	clientJsonFiles: List<String>,
	webhooksJsonFiles: List<String>
): GeneratorRunner(clientJsonFiles, webhooksJsonFiles) {
	override val fileWriter: FileWriter = DiskFileWriter()

	override fun processResults(fileWriter: FileWriter) {
		log.info("All files generated")
	}
}
