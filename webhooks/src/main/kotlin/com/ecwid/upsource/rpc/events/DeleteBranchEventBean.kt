package com.ecwid.upsource.rpc.events

data class DeleteBranchEventBean(
	/**
	 * Branch name (required)
	 */
	val name: String
) {
	internal constructor() : this(
		name = ""
	)
}
