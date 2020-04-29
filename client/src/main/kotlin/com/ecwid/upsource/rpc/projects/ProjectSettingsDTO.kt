package com.ecwid.upsource.rpc.projects

data class ProjectSettingsDTO(
	/**
	 * Project name (required)
	 */
	val projectName: String,

	/**
	 * VCS configuration represented as a JSON-encoded string (optional)
	 */
	val vcsSettings: String?,

	/**
	 * How often to check for new commits (in seconds) (optional)
	 */
	val checkIntervalSeconds: Long?,

	/**
	 * See ProjectModel parameters (required)
	 */
	val projectModel: ProjectModel,

	/**
	 * Code review ID pattern (required)
	 */
	val codeReviewIdPattern: String,

	/**
	 * Whether to run code inspections (optional)
	 */
	val runInspections: Boolean?,

	/**
	 * Name of the inspection profile in IntelliJ IDEA (optional)
	 */
	val inspectionProfileName: String?,

	/**
	 * The contents of maven-settings.xml (optional)
	 */
	val mavenSettings: String?,

	/**
	 * Maven profiles. Space- or comma-separated list (optional)
	 */
	val mavenProfiles: String?,

	/**
	 * Maven project JDK (optional)
	 */
	val mavenJdkName: String?,

	/**
	 * Model conversion system properties (optional)
	 */
	val modelConversionSystemProperties: String?,

	/**
	 * Gradle properties (optional)
	 */
	val gradleProperties: String?,

	/**
	 * Gradle init script (optional)
	 */
	val gradleInitScript: String?,

	/**
	 * See ExternalLinkDTO parameters (repeated)
	 */
	val externalLinks: List<ExternalLinkDTO>,

	/**
	 * See IssueTrackerProviderSettingsDTO parameters (optional)
	 */
	val issueTrackerProviderSettings: com.ecwid.upsource.rpc.issuetrackers.IssueTrackerProviderSettingsDTO?,

	/**
	 * Hub user management page URL (optional)
	 */
	val userManagementUrl: String?,

	/**
	 * Default encoding (e.g. UTF-8) (optional)
	 */
	val defaultEncoding: String?,

	/**
	 * Default branch (optional)
	 */
	val defaultBranch: String?,

	/**
	 * A newline-separated list of wildcards. Files matching the patterns specified here will be excluded from reviews (repeated)
	 */
	val ignoredFilesInReview: List<String>,

	/**
	 * A newline-separated list of wildcards. Files matching the patterns specified here — binaries, for example — won't be imported. (repeated)
	 */
	val skipFileContentsImport: List<String>,

	/**
	 * JavaScript language level (one of the following: JS_1_5, ES5, JS_1_8_5, ES6, JSX, NASHORN, FLOW) (optional)
	 */
	val javascriptLanguageLevel: String?,

	/**
	 * PHP language level (one of the following: null, 5.3.0, 5.4.0, 5.5.0, 5.6.0, 7, 7.1) (optional)
	 */
	val phpLanguageLevel: String?,

	/**
	 * List of paths to external dependencies for a PHP project (repeated)
	 */
	val phpExternalDependencies: List<String>,

	/**
	 * List of commands that will be run to set up PHP composer. Default command is "php composer.phar install" (repeated)
	 */
	val phpComposerScript: List<String>,

	/**
	 * Python language level (one of the following: null, 2, 3) (optional)
	 */
	val pythonLanguageLevel: String?,

	/**
	 * "login:password" credentials used to receive build status from the build server (optional)
	 */
	val buildStatusReceiveToken: String?,

	/**
	 * In addition to CLOSE_REVIEW permission, controls whether review authors can close reviews (optional)
	 */
	val authorCanCloseReview: Boolean?,

	/**
	 * In addition to DELETE_REVIEW permission, controls whether review authors can delete reviews (optional)
	 */
	val authorCanDeleteReview: Boolean?,

	/**
	 * In addition to EDIT_REVIEW permission, controls whether only the person that started a discussion can resolve it (optional)
	 */
	val limitResolveDiscussion: Boolean?,

	/**
	 * Default review deadline, in hours (optional)
	 */
	val reviewDeadlineHours: Int?,

	/**
	 * Sets whether merge commits should be added to branch reviews (optional)
	 */
	val addMergeCommitsToBranchReview: Boolean?,

	/**
	 * Whether the project is archived (optional)
	 */
	val isArchived: Boolean?
)