package com.ecwid.upsource.rpc.analytics

data class ModuleTimeValue(
	/**
	 * Name of the project module (required)
	 */
	val module: String,

	/**
	 * See TimeValue parameters (repeated)
	 */
	val items: List<TimeValue> = emptyList()
) {
	internal constructor() : this(
		module = "",
		items = emptyList()
	)
}
