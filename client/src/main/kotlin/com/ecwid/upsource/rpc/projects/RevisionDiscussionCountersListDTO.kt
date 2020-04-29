package com.ecwid.upsource.rpc.projects

data class RevisionDiscussionCountersListDTO(
	/**
	 * A discussion counter for a revision (number of discussions) (repeated)
	 */
	val counter: List<SimpleDiscussionCounterDTO>
)