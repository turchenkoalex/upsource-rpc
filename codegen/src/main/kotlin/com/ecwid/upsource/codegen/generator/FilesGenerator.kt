package com.ecwid.upsource.codegen.generator

import com.ecwid.upsource.codegen.TypeMapping
import com.ecwid.upsource.codegen.schema.UpsourceFile

interface FilesGenerator {
	fun processFiles(files: List<UpsourceFile>, typeMapping: TypeMapping) {
		files.forEach { file ->
			processFile(file, typeMapping)
		}
	}

	fun processFile(file: UpsourceFile, typeMapping: TypeMapping)
}
