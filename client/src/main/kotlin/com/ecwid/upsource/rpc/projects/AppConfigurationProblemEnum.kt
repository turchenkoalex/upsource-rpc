package com.ecwid.upsource.rpc.projects

/**
 * Describes a GitHub / GitLab configuration problem
 */
enum class AppConfigurationProblemEnum(val value: Byte) {
	IncompatibleHub(1),
	MissingAuthModule(2);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}