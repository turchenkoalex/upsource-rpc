package com.ecwid.upsource.rpc.files

/**
 * Describes "capabilities" of a PSI element
 */
enum class CapabilityFlagsEnum(val value: Byte) {
	canGotoDeclaration(1),
	canFindUsages(2),
	canViewHierarchy(4),
	canHaveDocumentation(8),
	isDeclaration(16),
	isWriteAccess(32);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}