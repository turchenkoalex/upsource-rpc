package com.ecwid.upsource.rpc.projects

data class AnchorDTO(
	/**
	 * Text range associated with an anchor (optional)
	 */
	val range: com.ecwid.upsource.rpc.ids.RangeDTO? = null,

	/**
	 * File associated with an anchor (optional)
	 */
	val fileId: String? = null,

	/**
	 * VCS revision ID (optional)
	 */
	val revisionId: String? = null,

	/**
	 * Whether a comment was left in the inline diff (optional)
	 */
	val inlineInRevision: String? = null
)