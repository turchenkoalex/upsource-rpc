package com.ecwid.upsource.rpc.projects

data class InspectionsCountDTO(
	/**
	 * undefined (required)
	 */
	val errors: Int,

	/**
	 * undefined (required)
	 */
	val warnings: Int,

	/**
	 * undefined (required)
	 */
	val weakWarnings: Int,

	/**
	 * undefined (required)
	 */
	val infos: Int
)