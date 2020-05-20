package com.ecwid.upsource.rpc.analytics

data class ModuleValue(
	/**
	 * Name of the project module (required)
	 */
	val module: String,

	/**
	 * The value associated with the module (required)
	 */
	val value: Int
) {
	internal constructor() : this(
		module = "",
		value = 0
	)
}
