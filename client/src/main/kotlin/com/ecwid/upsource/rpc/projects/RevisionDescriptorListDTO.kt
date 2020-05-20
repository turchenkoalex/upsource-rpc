package com.ecwid.upsource.rpc.projects

data class RevisionDescriptorListDTO(
	/**
	 * See RevisionInfoDTO parameters (repeated)
	 */
	val revision: List<RevisionInfoDTO> = emptyList(),

	/**
	 * See RevisionListGraphDTO parameters (optional)
	 */
	val graph: RevisionListGraphDTO? = null,

	/**
	 * Head revision ID (optional)
	 */
	val headHash: String? = null,

	/**
	 * Search query (optional)
	 */
	val query: String? = null
)