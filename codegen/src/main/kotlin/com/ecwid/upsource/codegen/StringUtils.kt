package com.ecwid.upsource.codegen

import java.util.*

private val PATTERN = Regex("[a-z][A-Z]")

fun snakeCase(value: String): String {
	return value.replace(PATTERN) {
		if (it.value.length == 2) {
			it.value[0] + "_" + it.value[1]
		} else {
			it.value
		}
	}.lowercase(Locale.US)
}
