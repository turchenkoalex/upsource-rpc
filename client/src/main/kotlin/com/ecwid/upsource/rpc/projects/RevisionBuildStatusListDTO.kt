package com.ecwid.upsource.rpc.projects

data class RevisionBuildStatusListDTO(
	/**
	 * Build status: Success(1), Failed(2), InProgress(3) (repeated)
	 */
	val buildStatus: List<RevisionBuildStatusDTO>
)