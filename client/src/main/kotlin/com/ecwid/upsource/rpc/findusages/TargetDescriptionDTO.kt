// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.findusages

/**
 * @param imageName ID of the element's image (if 'image' is none)
 * @param image Base62-encoded image (if 'imageName' is none)
 * @param targetPresentation Text representation of the given element
 * @param locationPresentation Text surrounding the element
 */
@Suppress("unused")
data class TargetDescriptionDTO(
	/**
	 * ID of the element's image (if 'image' is none) (optional)
	 */
	val imageName: String? = null,

	/**
	 * Base62-encoded image (if 'imageName' is none) (optional)
	 */
	val image: String? = null,

	/**
	 * Text representation of the given element (optional)
	 */
	val targetPresentation: String? = null,

	/**
	 * Text surrounding the element (optional)
	 */
	val locationPresentation: String? = null
)
