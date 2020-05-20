package com.ecwid.upsource.codegen.filewriter

import java.io.File

enum class FileDiffType(val errorMessage: String) {
	NOT_EXISTS("not exists"),
	CHANGED("changed")
}

data class FileDiff(
	val filename: String,
	val diffType: FileDiffType
)

class DryRunFileWriter : FileWriter {
	private val filesDiff = mutableListOf<FileDiff>()

	override fun writeFile(dir: String, filePackage: String, filename: String, content: String) {
		val absoluteFilename = buildFilename(
			dir = dir,
			filePackage = filePackage,
			filename = filename
		)

		val relativeFilename = absoluteFilename.removePrefix(dir)

		val file = File(absoluteFilename)
		if (!file.exists()) {
			filesDiff.add(
				FileDiff(
					filename = relativeFilename,
					diffType = FileDiffType.NOT_EXISTS
				)
			)
			return
		}

		val currentContent = file.readText(Charsets.UTF_8)
		if (currentContent != content) {
			filesDiff.add(
				FileDiff(
					filename = relativeFilename,
					diffType = FileDiffType.CHANGED
				)
			)
		}
	}

	fun hasChanges(): Boolean {
		return filesDiff.isNotEmpty()
	}

	fun report(): String {
		return filesDiff.joinToString("\n") {
			"File ${it.filename} ${it.diffType.errorMessage}"
		}
	}
}
