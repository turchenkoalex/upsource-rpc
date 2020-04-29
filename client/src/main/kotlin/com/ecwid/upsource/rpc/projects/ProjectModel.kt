package com.ecwid.upsource.rpc.projects

data class ProjectModel(
	/**
	 * Build system type ("none" to disable code intelligence, "maven" for Maven, "gradle" for Gradle, "idea" for IntelliJ IDEA) (required)
	 */
	val type: String,

	/**
	 * Path to project model (optional)
	 */
	val pathToModel: String?,

	/**
	 * Default project JDK (optional)
	 */
	val defaultJdkId: String?
)