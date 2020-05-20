package com.ecwid.upsource.rpc.analytics

data class ReviewCoverageDTO(
	/**
	 * Number of revisions covered by reviews (repeated)
	 */
	val allRevisions: List<TimeValue> = emptyList(),

	/**
	 * Number of revisions covered by open reviews (repeated)
	 */
	val revisionsCoveredByOpen: List<TimeValue> = emptyList(),

	/**
	 * Number of revisions covered by closed reviews (repeated)
	 */
	val revisionsCoveredByClosed: List<TimeValue> = emptyList()
)