package com.ecwid.upsource.codegen.filewriter

class AggregatedFileWriter(vararg writers: FileWriter) : FileWriter {
	private val writersList = writers.toList()

	override fun writeFile(dir: String, filePackage: String, filename: String, content: String) {
		writersList.map {
			it.writeFile(dir, filePackage, filename, content)
		}
	}
}
