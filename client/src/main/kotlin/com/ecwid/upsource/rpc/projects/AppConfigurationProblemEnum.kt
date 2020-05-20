package com.ecwid.upsource.rpc.projects

/**
 * Describes a GitHub / GitLab configuration problem
 */
enum class AppConfigurationProblemEnum(val value: Byte, val originalName: String) {
	INCOMPATIBLE_HUB(value = 1, originalName = "IncompatibleHub"),
	MISSING_AUTH_MODULE(value = 2, originalName = "MissingAuthModule");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
