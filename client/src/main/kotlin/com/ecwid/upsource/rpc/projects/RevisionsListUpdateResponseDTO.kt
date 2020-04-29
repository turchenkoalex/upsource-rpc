package com.ecwid.upsource.rpc.projects

data class RevisionsListUpdateResponseDTO(
	/**
	 * See RevisionInfoDTO parameters (repeated)
	 */
	val revision: List<RevisionInfoDTO>,

	/**
	 * Current head revision ID (required)
	 */
	val hash: String
)