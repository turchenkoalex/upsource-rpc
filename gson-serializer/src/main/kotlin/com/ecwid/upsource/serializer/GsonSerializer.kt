package com.ecwid.upsource.serializer

import com.ecwid.upsource.transport.RpcResponse
import com.ecwid.upsource.transport.RpcTransportResponse
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type
import java.util.concurrent.ConcurrentHashMap

class GsonSerializer : Serializer {
	private val gsonMap = ConcurrentHashMap<Class<*>, Pair<Gson, Type>>()
	private val genericGson = genericGsonBuiler().create()

	override fun serialize(request: Any): String {
		return genericGson.toJson(request)
	}

	override fun <T> deserialize(response: RpcTransportResponse, clazz: Class<T>): RpcResponse<T> {
		if (response.statusCode != 200) {
			try {
				val wrappedErrorMessage = genericGson.fromJson(response.content, WrappedErrorMessage::class.java)
				if (wrappedErrorMessage?.error != null) {
					return wrappedErrorMessage.error.toRpcResponse()
				}
			} catch (e: Exception) {
			}
		}

		val (gson, typeToken) = gsonMap.computeIfAbsent(clazz) {
			val gson = typedGsonBuilder(it).create()
			val typeToken = object : TypeToken<RpcResponse<T>>() {}.type

			return@computeIfAbsent gson to typeToken
		}

		return try {
			gson.fromJson(response.content, typeToken)
		} catch (e: Exception) {
			RpcResponse.Error(code = 0, message = e.message ?: "Json Parse Error")
		}
	}
}
