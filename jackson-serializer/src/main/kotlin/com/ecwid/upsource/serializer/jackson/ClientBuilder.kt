package com.ecwid.upsource.serializer.jackson

import com.ecwid.upsource.ClientBuilderWithTransport

fun <T> ClientBuilderWithTransport<T>.withJacksonSerializer() =
	withSerializer(JacksonSerializer())
