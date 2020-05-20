package com.ecwid.upsource.codegen.filewriter

import java.util.logging.Logger

private val log = Logger.getLogger(ConsoleFileWriter::class.qualifiedName)

class ConsoleFileWriter(private val showContent: Boolean) : FileWriter {
	override fun writeFile(dir: String, filePackage: String, filename: String, content: String) {
		val absoluteFilename = buildFilename(
			dir = dir,
			filePackage = filePackage,
			filename = filename
		)
		val message = "Save to $absoluteFilename content with size ${content.length}" + if (showContent) {
			"\n$content"
		} else {
			""
		}
		log.info(message)
	}
}
