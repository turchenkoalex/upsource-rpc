package com.ecwid.upsource.rpc.findusages

data class TargetDescriptionDTO(
	/**
	 * ID of the element's image (if 'image' is none) (optional)
	 */
	val imageName: String?,

	/**
	 * Base62-encoded image (if 'imageName' is none) (optional)
	 */
	val image: String?,

	/**
	 * Text representation of the given element (optional)
	 */
	val targetPresentation: String?,

	/**
	 * Text surrounding the element (optional)
	 */
	val locationPresentation: String?
)