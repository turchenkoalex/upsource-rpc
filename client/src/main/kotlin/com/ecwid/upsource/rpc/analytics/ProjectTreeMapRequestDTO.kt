package com.ecwid.upsource.rpc.analytics

data class ProjectTreeMapRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Revision ID (required)
	 */
	val revisionId: String
)