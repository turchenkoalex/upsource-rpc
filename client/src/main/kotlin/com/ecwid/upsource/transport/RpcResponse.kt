package com.ecwid.upsource.transport

sealed class RpcResponse<T> {
	data class Ok<T>(val result: T) : RpcResponse<T>()
	data class Error<T>(val code: Int, val message: String) : RpcResponse<T>()
}
