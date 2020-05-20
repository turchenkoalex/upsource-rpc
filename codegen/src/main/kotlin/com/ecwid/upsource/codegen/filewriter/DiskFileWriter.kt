package com.ecwid.upsource.codegen.filewriter

import java.io.File

class DiskFileWriter : FileWriter {
	override fun writeFile(dir: String, filePackage: String, filename: String, content: String) {
		val absoluteFilename = buildFilename(
			dir = dir,
			filePackage = filePackage,
			filename = filename
		)
		val file = File(absoluteFilename)
		file.parentFile.mkdirs()
		file.writeText(content, Charsets.UTF_8)
	}
}
