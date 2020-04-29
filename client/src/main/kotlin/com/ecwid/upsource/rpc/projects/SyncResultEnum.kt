package com.ecwid.upsource.rpc.projects

/**
 * Describes status of a GitHub/GitLab synchronisation
 */
enum class SyncResultEnum(val value: Byte) {
	Ok(1),
	ProjectNotSynchronized(2),
	CommentNotSynchronized(3),
	ReviewNotSynchronized(4),
	AccessTokenNotProvided(5),
	GithubMisconfiguration(6),
	UnsupportedMethod(7),
	NotFound(8),
	InternalError(9),
	RateLimitExceeded(10),
	IoError(11);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}