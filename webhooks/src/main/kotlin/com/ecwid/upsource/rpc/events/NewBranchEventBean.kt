package com.ecwid.upsource.rpc.events

data class NewBranchEventBean(
	/**
	 * Branch name (required)
	 */
	val name: String
) {
	internal constructor() : this(
		name = ""
	)
}
