package com.ecwid.upsource.rpc.projects

data class InspectionsCountDTO(
	val errors: Int,

	val warnings: Int,

	val weakWarnings: Int,

	val infos: Int
) {
	internal constructor() : this(
		errors = 0,
		warnings = 0,
		weakWarnings = 0,
		infos = 0
	)
}
