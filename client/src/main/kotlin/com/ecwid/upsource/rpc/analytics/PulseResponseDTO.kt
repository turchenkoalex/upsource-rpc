package com.ecwid.upsource.rpc.analytics

data class PulseResponseDTO(
	/**
	 * Pulse values (number of commits in a week) for the current authenticated user (repeated)
	 */
	val userValues: List<Int>,

	/**
	 * Pulse values for all users in a project (repeated)
	 */
	val allValues: List<Int>
)