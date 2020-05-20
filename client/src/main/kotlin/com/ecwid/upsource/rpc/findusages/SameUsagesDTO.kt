package com.ecwid.upsource.rpc.findusages

data class SameUsagesDTO(
	/**
	 * Old usage of the element. See FindUsagesItemDTO parameters (required)
	 */
	val oldUsage: FindUsagesItemDTO,

	/**
	 * New usage of the element. See FindUsagesItemDTO parameters (required)
	 */
	val newUsage: FindUsagesItemDTO
) {
	internal constructor() : this(
		oldUsage = FindUsagesItemDTO(),
		newUsage = FindUsagesItemDTO()
	)
}
