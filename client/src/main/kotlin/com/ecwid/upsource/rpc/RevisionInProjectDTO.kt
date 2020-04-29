package com.ecwid.upsource.rpc

data class RevisionInProjectDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * VCS revision ID (required)
	 */
	val revisionId: String
)