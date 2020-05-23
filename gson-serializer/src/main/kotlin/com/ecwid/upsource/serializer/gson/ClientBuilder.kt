package com.ecwid.upsource.serializer.gson

import com.ecwid.upsource.ClientBuilderWithTransport

fun <T> ClientBuilderWithTransport<T>.withGsonSerializer() =
	withSerializer(GsonSerializer())
