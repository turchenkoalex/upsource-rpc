package com.ecwid.upsource.codegen.schema

data class UpsourceFile(
	val fileName: String,
	val fullPackage: String,
	val packageName: String,
	val schema: Schema
)
