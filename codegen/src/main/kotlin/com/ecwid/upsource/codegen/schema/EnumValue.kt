package com.ecwid.upsource.codegen.schema

data class EnumValue(
	val name: String,
	val originalName: String = "",
	val description: String?,
	val number: Byte
)
