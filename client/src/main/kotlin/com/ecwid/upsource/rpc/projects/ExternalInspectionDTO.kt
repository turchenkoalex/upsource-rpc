package com.ecwid.upsource.rpc.projects

data class ExternalInspectionDTO(
	/**
	 * VCS revision ID (required)
	 */
	val revisionId: String,

	/**
	 * Name of the file (required)
	 */
	val fileName: String,

	/**
	 * Line number (required)
	 */
	val line: Int,

	/**
	 * Inspection severity (required)
	 */
	val severity: com.ecwid.upsource.rpc.files.InspectionSeverityEnum,

	/**
	 * Inspection message (required)
	 */
	val message: String
)