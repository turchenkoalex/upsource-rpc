package com.ecwid.upsource.codegen.schema

data class EnumType(
	val name: String,
	val description: String?,
	val values: List<EnumValue>
)
