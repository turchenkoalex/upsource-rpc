package com.ecwid.upsource.rpc.projects

data class RevisionDescriptorListDTO(
	/**
	 * See RevisionInfoDTO parameters (repeated)
	 */
	val revision: List<RevisionInfoDTO>,

	/**
	 * See RevisionListGraphDTO parameters (optional)
	 */
	val graph: RevisionListGraphDTO?,

	/**
	 * Head revision ID (optional)
	 */
	val headHash: String?,

	/**
	 * Search query (optional)
	 */
	val query: String?
)