package com.ecwid.upsource.codegen.resources

import java.io.File

class Resources {
	fun readResource(fileName: String): String? {
		val resourceURI = this.javaClass.classLoader.getResource(fileName)
			?: return null

		val file = File(resourceURI.toURI())
		if (!file.exists()) {
			return null
		}

		return file.readText(Charsets.UTF_8)
	}
}

