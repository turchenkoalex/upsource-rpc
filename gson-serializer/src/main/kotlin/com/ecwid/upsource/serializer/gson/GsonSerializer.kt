package com.ecwid.upsource.serializer.gson

import com.ecwid.upsource.serializer.Serializer
import com.ecwid.upsource.transport.RpcResponse
import com.ecwid.upsource.transport.RpcTransportResponse
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type
import java.util.concurrent.ConcurrentHashMap
import java.util.logging.Level
import java.util.logging.Logger

private val log = Logger.getLogger(GsonSerializer::class.qualifiedName)

class GsonSerializer : Serializer {
	private val gsonMap = ConcurrentHashMap<Class<*>, Pair<Gson, Type>>()
	private val genericGson = genericGsonBuiler().create()

	override fun serialize(request: Any): String {
		return genericGson.toJson(request)
	}

	override fun <T> deserialize(response: RpcTransportResponse, clazz: Class<T>): RpcResponse<T> {
		if (response.statusCode == 200) {
			try {
				val (gson, typeToken) = gsonMap.computeIfAbsent(clazz) {
					val gson = typedGsonBuilder(it).create()
					val typeToken = object : TypeToken<RpcResponse<T>>() {}.type

					return@computeIfAbsent gson to typeToken
				}

				return gson.fromJson(response.content, typeToken)
			} catch (e: Exception) {
				log.log(Level.WARNING, "Error while deserialize json response", e)
			}
		}


		try {
			val wrappedErrorMessage = genericGson.fromJson(response.content, WrappedErrorMessage::class.java)
			if (wrappedErrorMessage?.error != null) {
				return wrappedErrorMessage.error.toRpcResponse()
			}
		} catch (e: Exception) {
			// nothing to do
		}

		// Fallback
		return RpcResponse.Error(code = response.statusCode, message = response.content)
	}
}
