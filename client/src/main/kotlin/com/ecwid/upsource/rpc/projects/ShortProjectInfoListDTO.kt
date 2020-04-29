package com.ecwid.upsource.rpc.projects

data class ShortProjectInfoListDTO(
	/**
	 * See ShortProjectInfoDTO parameters (repeated)
	 */
	val project: List<ShortProjectInfoDTO>
)