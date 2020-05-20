package com.ecwid.upsource.rpc.findusages

data class TextSearchProjectDetails(
	/**
	 * Holds the project name (required)
	 */
	val projectName: String
) {
	internal constructor() : this(
		projectName = ""
	)
}
