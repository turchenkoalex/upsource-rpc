package com.ecwid.upsource.codegen.schema

data class Service(
	val name: String,
	val description: String,
	val methods: List<Method>
)
