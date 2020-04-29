package com.ecwid.upsource.serializer

import com.ecwid.upsource.transport.RpcResponse
import com.ecwid.upsource.transport.RpcTransportResponse

interface Serializer {
	fun serialize(request: Any): String
	fun <T> deserialize(response: RpcTransportResponse, clazz: Class<T>): RpcResponse<T>
}
