package com.ecwid.upsource.codegen

data class Config(
	val clientDir: String,
	val gsonLibraryDir: String,
	val jacksonLibraryDir: String,
	val webhooksDir: String,
	val dryRun: Boolean
)

