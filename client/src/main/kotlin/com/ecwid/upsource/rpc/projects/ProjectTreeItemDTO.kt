package com.ecwid.upsource.rpc.projects

data class ProjectTreeItemDTO(
	/**
	 * Display name of a project tree item (required)
	 */
	val displayName: String,

	/**
	 * Display type – directory, module, file, etc. (required)
	 */
	val displayType: String,

	/**
	 * Whether an item is a directory (required)
	 */
	val isDirectory: Boolean,

	/**
	 * Whether an item is a module (required)
	 */
	val isModule: Boolean,

	/**
	 * Path to file (required)
	 */
	val fileId: String,

	/**
	 * Whether an item has children and can be expanded (required)
	 */
	val hasChildren: Boolean
)