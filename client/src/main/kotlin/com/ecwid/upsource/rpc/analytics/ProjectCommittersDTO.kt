// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param users See CommitterUserInfo parameters
 */
data class ProjectCommittersDTO(
	/**
	 * See CommitterUserInfo parameters (repeated)
	 * 
	 * @see com.ecwid.upsource.rpc.analytics.CommitterUserInfo
	 */
	val users: List<CommitterUserInfo> = emptyList()
)