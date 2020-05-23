package com.ecwid.upsource.serializer.gson

import com.ecwid.upsource.serializer.gson.adapters.RpcResponseTypeAdapter
import com.ecwid.upsource.transport.RpcResponse
import com.google.gson.GsonBuilder

internal fun <T> typedGsonBuilder(clazz: Class<T>): GsonBuilder {
	return genericGsonBuiler()
		.registerTypeAdapter(RpcResponse::class.java, RpcResponseTypeAdapter(clazz))
}
