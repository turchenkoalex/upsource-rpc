package com.ecwid.upsource.serializer.jackson

import com.ecwid.upsource.serializer.Serializer
import com.ecwid.upsource.transport.RpcResponse
import com.ecwid.upsource.transport.RpcTransportResponse
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import java.util.concurrent.ConcurrentHashMap

class JacksonSerializer : Serializer {
	private val objectMapper = buildMapper()
	private val types = ConcurrentHashMap<Class<*>, JavaType>()

	override fun serialize(request: Any): String {
		return objectMapper.writeValueAsString(request)
	}

	override fun <T> deserialize(response: RpcTransportResponse, clazz: Class<T>): RpcResponse<T> {
		if (response.statusCode == 200) {
			try {
				val type = types.computeIfAbsent(clazz) {
					objectMapper.typeFactory.constructParametricType(ResultWrapper::class.java, it)
				}
				val wrapper = objectMapper.readValue<ResultWrapper<T>>(response.content, type)
				return RpcResponse.Ok(wrapper.result)
			} catch (e: Exception) {
				// not success result type
			}
		}

		try {
			val wrapper = objectMapper.readValue(response.content, WrappedErrorMessage::class.java)
			if (wrapper.error != null) {
				return wrapper.error.toRpcResponse()
			}
		} catch (e: Exception) {
			// not error result type
		}

		// Fallback
		return RpcResponse.Error(response.statusCode, response.content)
	}
}

private fun buildMapper(): ObjectMapper {
	return ObjectMapper()
		.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
		.registerModule(buildUpsourceModule())
		.registerKotlinModule()
}

private data class ResultWrapper<T>(
	val result: T
)

