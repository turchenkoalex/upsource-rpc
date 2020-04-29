package com.ecwid.upsource.rpc.files

/**
 * Describes PSI inspections level
 */
enum class FileWarningLevelEnum(val value: Byte) {
	none(1),
	ok(2),
	warning(3),
	error(4);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}