package com.ecwid.upsource.rpc.findusages

data class UsagesDiffFullRequestDTO(
	/**
	 * Old element. See PsiElementIdDTO parameters (required)
	 */
	val oldElement: PsiElementIdDTO,

	/**
	 * New element. See PsiElementIdDTO parameters (required)
	 */
	val newElement: PsiElementIdDTO
)