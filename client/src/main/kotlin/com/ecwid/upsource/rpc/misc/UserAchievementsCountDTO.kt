package com.ecwid.upsource.rpc.misc

data class UserAchievementsCountDTO(
	val count: Int
) {
	internal constructor() : this(
		count = 0
	)
}
