package com.ecwid.upsource.rpc.projects

data class VcsRepoListDTO(
	/**
	 * See VcsRepoDTO parameters (repeated)
	 */
	val repo: List<VcsRepoDTO> = emptyList()
)