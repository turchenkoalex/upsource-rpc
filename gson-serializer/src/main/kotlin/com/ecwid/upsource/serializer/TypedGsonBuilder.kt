package com.ecwid.upsource.serializer

import com.google.gson.GsonBuilder
import com.ecwid.upsource.serializer.adapters.RpcResponseTypeAdapter
import com.ecwid.upsource.transport.RpcResponse

internal fun <T> typedGsonBuilder(clazz: Class<T>): GsonBuilder {
	return genericGsonBuiler()
		.registerTypeAdapter(RpcResponse::class.java, RpcResponseTypeAdapter(clazz))
}
