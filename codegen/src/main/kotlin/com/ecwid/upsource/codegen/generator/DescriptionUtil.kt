package com.ecwid.upsource.codegen.generator

import com.ecwid.upsource.codegen.TypeMapping

private val seeMatcher = Regex("See (\\w+)")

fun String.addSeeAnnotationsIfRequired(typeMapping: TypeMapping): String {
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
		val realType = typeMapping.findPackage(it)
		if (!realType.isNullOrEmpty()) {
			"@see $realType.$it"
		} else {
			"@see $it"
		}
	}
}
