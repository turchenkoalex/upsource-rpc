package com.ecwid.upsource.serializer

import com.ecwid.upsource.ClientBuilderWithTransport

fun <T> ClientBuilderWithTransport<T>.withGsonSerializer() =
	this.withSerializer(GsonSerializer())
