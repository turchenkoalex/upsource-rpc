// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param revision See RevisionInfoDTO parameters
 * @param hash Current head revision ID
 */
@Suppress("unused")
data class RevisionsListUpdateResponseDTO(
	/**
	 * See RevisionInfoDTO parameters (repeated)
	 *
	 * @see com.ecwid.upsource.rpc.projects.RevisionInfoDTO
	 */
	val revision: List<RevisionInfoDTO> = emptyList(),

	/**
	 * Current head revision ID (required)
	 */
	val hash: String
) {
	@Suppress("unused")
	internal constructor() : this(
		revision = emptyList(),
		hash = ""
	)
}

