package com.ecwid.upsource.codegen.schema

data class Method(
	val name: String,
	val description: String?,
	val argumentType: String,
	val returnType: String
)
