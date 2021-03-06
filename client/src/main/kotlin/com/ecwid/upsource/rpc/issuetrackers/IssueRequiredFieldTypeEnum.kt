// Generated by the codegen. Please DO NOT EDIT!
// source: enum.ftl

package com.ecwid.upsource.rpc.issuetrackers

@Suppress("unused")
enum class IssueRequiredFieldTypeEnum(val value: Byte, val originalName: String) {
	TEXT(value = 1, originalName = "Text"),
	DATE(value = 2, originalName = "Date"),
	VALUE(value = 3, originalName = "Value"),
	ARRAY(value = 4, originalName = "Array");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
