// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectName Project name
 * @param projectId Project ID in Upsource
 * @param headHash Head revision ID
 * @param codeReviewIdPattern Code review ID pattern
 * @param externalLinks External links. See ExternalLinkDTO parameters
 * @param issueTrackerConnections Configured issue tracker links
 * @param projectModelType Build system type ("none" to disable code intelligence, "maven" for Maven, "gradle" for Gradle, "idea" for IntelliJ IDEA)
 * @param defaultEffectiveCharset Default encoding (e.g. UTF-8)
 * @param defaultBranch Default branch
 * @param issueTrackerDetails See IssueTrackerProjectDetailsDTO parameters
 * @param isConnectedToGithub Whether the project is connected to GitHub
 * @param isConnectedToGitlab Whether the project is connected to GitLab
 * @param iconUrl URL of the project icon
 * @param group See ProjectGroupDTO parameters
 * @param isArchived 
 */
data class ProjectInfoDTO(
	/**
	 * Project name (required)
	 */
	val projectName: String,

	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Head revision ID (required)
	 */
	val headHash: String,

	/**
	 * Code review ID pattern (required)
	 */
	val codeReviewIdPattern: String,

	/**
	 * External links. See ExternalLinkDTO parameters (repeated)
	 * 
	 * @see ExternalLinkDTO
	 */
	val externalLinks: List<ExternalLinkDTO> = emptyList(),

	/**
	 * Configured issue tracker links (repeated)
	 */
	val issueTrackerConnections: List<ExternalLinkDTO> = emptyList(),

	/**
	 * Build system type ("none" to disable code intelligence, "maven" for Maven, "gradle" for Gradle, "idea" for IntelliJ IDEA) (required)
	 */
	val projectModelType: String,

	/**
	 * Default encoding (e.g. UTF-8) (required)
	 */
	val defaultEffectiveCharset: String,

	/**
	 * Default branch (optional)
	 */
	val defaultBranch: String? = null,

	/**
	 * See IssueTrackerProjectDetailsDTO parameters (optional)
	 * 
	 * @see IssueTrackerProjectDetailsDTO
	 */
	val issueTrackerDetails: com.ecwid.upsource.rpc.issuetrackers.IssueTrackerProjectDetailsDTO? = null,

	/**
	 * Whether the project is connected to GitHub (required)
	 */
	val isConnectedToGithub: Boolean,

	/**
	 * Whether the project is connected to GitLab (required)
	 */
	val isConnectedToGitlab: Boolean,

	/**
	 * URL of the project icon (optional)
	 */
	val iconUrl: String? = null,

	/**
	 * See ProjectGroupDTO parameters (optional)
	 * 
	 * @see ProjectGroupDTO
	 */
	val group: ProjectGroupDTO? = null,

	val isArchived: Boolean? = null
) {
	internal constructor() : this(
		projectName = "",
		projectId = "",
		headHash = "",
		codeReviewIdPattern = "",
		externalLinks = emptyList(),
		issueTrackerConnections = emptyList(),
		projectModelType = "",
		defaultEffectiveCharset = "",
		defaultBranch = null,
		issueTrackerDetails = null,
		isConnectedToGithub = false,
		isConnectedToGitlab = false,
		iconUrl = null,
		group = null,
		isArchived = null
	)
}
