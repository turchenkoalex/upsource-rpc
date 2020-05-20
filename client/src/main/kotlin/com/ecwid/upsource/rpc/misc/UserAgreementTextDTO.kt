package com.ecwid.upsource.rpc.misc

data class UserAgreementTextDTO(
	val text: String
) {
	internal constructor() : this(
		text = ""
	)
}
