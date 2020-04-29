package com.ecwid.upsource.rpc.projects

data class AnchorDTO(
	/**
	 * Text range associated with an anchor (optional)
	 */
	val range: com.ecwid.upsource.rpc.RangeDTO?,

	/**
	 * File associated with an anchor (optional)
	 */
	val fileId: String?,

	/**
	 * VCS revision ID (optional)
	 */
	val revisionId: String?,

	/**
	 * Whether a comment was left in the inline diff (optional)
	 */
	val inlineInRevision: String?
)