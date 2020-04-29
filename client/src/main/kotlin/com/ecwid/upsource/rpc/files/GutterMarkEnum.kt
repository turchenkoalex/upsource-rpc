package com.ecwid.upsource.rpc.files

/**
 * Describes the properties of a gutter marker
 */
enum class GutterMarkEnum(val value: Byte) {
	hasSuperElements(1),
	hasDerivedElements(2);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}