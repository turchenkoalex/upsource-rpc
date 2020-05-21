package com.ecwid.upsource.transport

import com.ecwid.upsource.EmptyClientBuilder

fun <T> EmptyClientBuilder<T>.withHttpClient(upsourceConnection: UpsourceConnection) =
	this.withTransport(HttpRpcTransport(upsourceConnection))
