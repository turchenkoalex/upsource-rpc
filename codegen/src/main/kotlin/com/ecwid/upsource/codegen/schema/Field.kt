package com.ecwid.upsource.codegen.schema

data class Field(
	val name: String,
	val description: String?,
	val label: String,
	val type: String,
	val defaultValue: String = ""
)
