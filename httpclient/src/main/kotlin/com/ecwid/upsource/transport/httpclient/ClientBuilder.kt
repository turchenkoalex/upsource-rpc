package com.ecwid.upsource.transport.httpclient

import com.ecwid.upsource.EmptyClientBuilder
import com.ecwid.upsource.transport.UpsourceConnection

fun <T> EmptyClientBuilder<T>.withHttpClient(upsourceConnection: UpsourceConnection) =
	withTransport(HttpRpcTransport(upsourceConnection))
