// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param userIds User IDs of graph nodes
 * @param links Graph links
 */
data class ReviewersGraphDTO(
	/**
	 * User IDs of graph nodes (repeated)
	 */
	val userIds: List<String> = emptyList(),

	/**
	 * Graph links (repeated)
	 */
	val links: List<ReviewersGraphLinkDTO> = emptyList()
)