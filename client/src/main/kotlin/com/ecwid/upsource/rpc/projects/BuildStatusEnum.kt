package com.ecwid.upsource.rpc.projects

/**
 * Describes build status
 */
enum class BuildStatusEnum(val value: Byte, val originalName: String) {
	SUCCESS(value = 1, originalName = "Success"),
	FAILED(value = 2, originalName = "Failed"),
	IN_PROGRESS(value = 3, originalName = "InProgress");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
