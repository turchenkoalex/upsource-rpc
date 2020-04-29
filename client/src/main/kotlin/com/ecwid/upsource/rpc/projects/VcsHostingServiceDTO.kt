package com.ecwid.upsource.rpc.projects

data class VcsHostingServiceDTO(
	/**
	 * VCS hosting service ID (required)
	 */
	val serviceId: String,

	/**
	 * VCS hosting service URL (required)
	 */
	val serviceUrl: String,

	/**
	 * IDs of the VCS repositories (repeated)
	 */
	val repoIds: List<String>,

	/**
	 * Whether the requester has permission to create repositories in the VCS service (required)
	 */
	val canCreateRepository: Boolean
)