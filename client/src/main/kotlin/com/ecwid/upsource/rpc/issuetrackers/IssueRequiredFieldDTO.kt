package com.ecwid.upsource.rpc.issuetrackers

data class IssueRequiredFieldDTO(
	/**
	 * Issue type ID (required)
	 */
	val issueTypeId: String,

	/**
	 * See IssueFieldDTO parameters (required)
	 */
	val field: IssueFieldDTO,

	/**
	 * Field type (required)
	 */
	val fieldType: IssueRequiredFieldTypeEnum
) {
	internal constructor() : this(
		issueTypeId = "",
		field = IssueFieldDTO(),
		fieldType = IssueRequiredFieldTypeEnum.TEXT
	)
}
