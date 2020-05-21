package com.ecwid.upsource.serializer

import com.ecwid.upsource.ClientBuilderWithTransport

fun <T> ClientBuilderWithTransport<T>.withJaksonSerializer() =
	this.withSerializer(JaksonSerializer())
