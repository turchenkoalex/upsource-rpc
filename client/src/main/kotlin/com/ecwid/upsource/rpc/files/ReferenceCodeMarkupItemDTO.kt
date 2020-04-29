package com.ecwid.upsource.rpc.files

data class ReferenceCodeMarkupItemDTO(
	/**
	 * See RangeDTO parameters (required)
	 */
	val range: com.ecwid.upsource.rpc.RangeDTO,

	/**
	 * ID of the markup element (required)
	 */
	val markupId: Int,

	/**
	 * ID of the target element (required)
	 */
	val targetId: Int,

	/**
	 * Bit mask of the 'CapabilityFlagsEnum' enum (required)
	 */
	val capabilityFlags: Int,

	/**
	 * Used to identify the exact reference when references overlap (required)
	 */
	val localIndex: Int,

	/**
	 * Hash of the PSI element (if any), used to test PSI elements for equality (optional)
	 */
	val hash: String?
)