package com.ecwid.upsource.serializer

import com.ecwid.upsource.transport.RpcResponse

internal data class ErrorMessage(
	val code: Int,
	val message: String
) {
	fun <T> toRpcResponse(): RpcResponse.Error<T> {
		return RpcResponse.Error(
			code = code,
			message = message
		)
	}
}
