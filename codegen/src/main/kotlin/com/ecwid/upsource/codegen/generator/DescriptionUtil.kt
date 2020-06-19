package com.ecwid.upsource.codegen.generator

private val seeMatcher = Regex("See (\\w+)")

fun String.addSeeAnnotationsIfRequired(): String {
	val seeGroups = seeMatcher.findAll(this)
		.toList()
		.mapNotNull {
			if (it.groupValues.size == 2) {
				it.groupValues[1]
			} else {
				null
			}
		}

	if (seeGroups.isEmpty()) {
		return this
	}

	return seeGroups.joinToString(
		separator = "\n",
		prefix = "$this\n\n"
	) {
		"@see $it"
	}
}
