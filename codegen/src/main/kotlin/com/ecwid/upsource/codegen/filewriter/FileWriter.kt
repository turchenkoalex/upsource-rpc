package com.ecwid.upsource.codegen.filewriter

import java.nio.file.Path

interface FileWriter {
	fun writeFile(dir: String, filePackage: String, filename: String, content: String)

	fun buildFilename(dir: String, filePackage: String, filename: String): String {
		val packagePath = filePackage.replace(".", "/")
		return Path.of(dir, packagePath, filename).toString()
	}
}
