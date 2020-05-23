package com.ecwid.upsource.serializer.gson.adapters

import com.ecwid.upsource.serializer.gson.ErrorMessage
import com.ecwid.upsource.transport.RpcResponse
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonElement
import java.lang.reflect.Type

class RpcResponseTypeAdapter<T>(private val clazz: Class<T>) : com.google.gson.JsonDeserializer<RpcResponse<T>> {
	override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): RpcResponse<T> {
		val jsonObject = json.asJsonObject
		if (jsonObject != null) {
			val resultObject = jsonObject.getAsJsonObject("result")
			if (resultObject != null) {
				val deserializedT = context.deserialize<T>(resultObject, clazz)
				return RpcResponse.Ok(deserializedT)
			}

			val errorObject = jsonObject.get("error")?.asJsonObject
			if (errorObject != null) {
				val errorMessage = context.deserialize<ErrorMessage>(errorObject, ErrorMessage::class.java)
				if (errorMessage != null) {
					return errorMessage.toRpcResponse()
				}
			}
		}

		return RpcResponse.Error(0, "Unknown error")
	}
}
