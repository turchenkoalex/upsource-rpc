package com.ecwid.upsource.rpc.users

data class UserAbsenceRequestDTO(
	/**
	 * Absence end date (optional)
	 */
	val absentUntil: Long?,

	/**
	 * User ID in Upsource ("null" denotes current user) (optional)
	 */
	val userId: String?
)