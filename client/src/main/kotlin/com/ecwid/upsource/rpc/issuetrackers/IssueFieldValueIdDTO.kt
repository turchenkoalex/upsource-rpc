package com.ecwid.upsource.rpc.issuetrackers

data class IssueFieldValueIdDTO(
	/**
	 * Field ID (see IssueFieldDTO) (required)
	 */
	val fieldId: String,

	/**
	 * Value ID (see IssueFieldValueDTO) (required)
	 */
	val valueId: String
) {
	internal constructor() : this(
		fieldId = "",
		valueId = ""
	)
}
