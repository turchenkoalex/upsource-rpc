// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param commits See FindCommitsRequestPatternDTO parameters
 * @param requestChanges Whether revision changes should be returned along with revision metadata (unused, left for compatibility with older clients)
 * @param limit Number of commits to return
 */
@Suppress("unused")
data class FindCommitsRequestDTO(
	/**
	 * See FindCommitsRequestPatternDTO parameters (repeated)
	 *
	 * @see com.ecwid.upsource.rpc.projects.FindCommitsRequestPatternDTO
	 */
	val commits: List<FindCommitsRequestPatternDTO> = emptyList(),

	/**
	 * Whether revision changes should be returned along with revision metadata (unused, left for compatibility with older clients) (optional)
	 */
	val requestChanges: Boolean? = null,

	/**
	 * Number of commits to return (optional)
	 */
	val limit: Int? = null
)
