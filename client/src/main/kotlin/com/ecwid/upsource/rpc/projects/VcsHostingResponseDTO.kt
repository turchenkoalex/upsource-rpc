package com.ecwid.upsource.rpc.projects

data class VcsHostingResponseDTO(
	/**
	 * See VcsHostingServiceDTO parameters (repeated)
	 */
	val service: List<VcsHostingServiceDTO> = emptyList()
)