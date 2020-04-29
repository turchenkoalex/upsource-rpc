package com.ecwid.upsource.rpc.projects

data class CreateDiscussionRequestDTO(
	/**
	 * See AnchorDTO parameters (required)
	 */
	val anchor: AnchorDTO,

	/**
	 * See ReviewIdDTO parameters (optional)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO?,

	/**
	 * Text of the discussion (required)
	 */
	val text: String,

	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Currently not in use (optional)
	 */
	val markupType: String?,

	/**
	 * Discussion labels. See LabelDTO parameters (repeated)
	 */
	val labels: List<LabelDTO>
)