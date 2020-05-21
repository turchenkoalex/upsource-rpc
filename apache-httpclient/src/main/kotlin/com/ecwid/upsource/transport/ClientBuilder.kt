package com.ecwid.upsource.transport

import com.ecwid.upsource.EmptyClientBuilder

fun <T> EmptyClientBuilder<T>.withApacheHttpClient(upsourceConnection: UpsourceConnection) =
	this.withTransport(ApacheHttpRpcTransport(upsourceConnection))
