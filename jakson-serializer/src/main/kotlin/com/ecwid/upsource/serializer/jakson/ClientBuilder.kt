package com.ecwid.upsource.serializer.jakson

import com.ecwid.upsource.ClientBuilderWithTransport

fun <T> ClientBuilderWithTransport<T>.withJaksonSerializer() =
	withSerializer(JaksonSerializer())
