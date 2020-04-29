package com.ecwid.upsource.rpc.issuetrackers

/**
 * undefined
 */
enum class IssueRequiredFieldTypeEnum(val value: Byte) {
	Text(1),
	Date(2),
	Value(3),
	Array(4);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}