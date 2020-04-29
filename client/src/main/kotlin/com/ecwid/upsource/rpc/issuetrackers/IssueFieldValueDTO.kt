package com.ecwid.upsource.rpc.issuetrackers

data class IssueFieldValueDTO(
	/**
	 * Value ID (required)
	 */
	val valueId: String,

	/**
	 * Value title (required)
	 */
	val name: String,

	/**
	 * HTML presentation of the value, e.g. a <span> with some inline styles (required)
	 */
	val html: String
)