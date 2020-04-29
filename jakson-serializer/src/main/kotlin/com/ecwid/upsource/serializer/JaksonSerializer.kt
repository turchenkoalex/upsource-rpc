package com.ecwid.upsource.serializer

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import com.ecwid.upsource.transport.RpcResponse
import com.ecwid.upsource.transport.RpcTransportResponse

class JaksonSerializer : Serializer {
	val objectMapper = ObjectMapper().registerKotlinModule()

	override fun serialize(request: Any): String {
		return objectMapper.writeValueAsString(request)
	}

	override fun <T> deserialize(response: RpcTransportResponse, clazz: Class<T>): RpcResponse<T> {
		TODO("Not implemented")
	}
}
