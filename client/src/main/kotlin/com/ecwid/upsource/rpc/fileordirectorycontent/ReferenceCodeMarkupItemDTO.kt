package com.ecwid.upsource.rpc.fileordirectorycontent

data class ReferenceCodeMarkupItemDTO(
	/**
	 * See RangeDTO parameters (required)
	 */
	val range: com.ecwid.upsource.rpc.ids.RangeDTO,

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
	val hash: String? = null
) {
	internal constructor() : this(
		range = com.ecwid.upsource.rpc.ids.RangeDTO(),
		markupId = 0,
		targetId = 0,
		capabilityFlags = 0,
		localIndex = 0,
		hash = null
	)
}
