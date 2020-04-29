package com.ecwid.upsource.rpc.analytics

data class ReviewCoverageDTO(
	/**
	 * Number of revisions covered by reviews (repeated)
	 */
	val allRevisions: List<TimeValue>,

	/**
	 * Number of revisions covered by open reviews (repeated)
	 */
	val revisionsCoveredByOpen: List<TimeValue>,

	/**
	 * Number of revisions covered by closed reviews (repeated)
	 */
	val revisionsCoveredByClosed: List<TimeValue>
)