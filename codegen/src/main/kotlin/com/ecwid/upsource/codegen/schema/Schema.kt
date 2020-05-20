package com.ecwid.upsource.codegen.schema

data class Schema(
	val enums: List<EnumType> = emptyList(),
	val messages: List<Message> = emptyList(),
	val services: List<Service> = emptyList()
)
