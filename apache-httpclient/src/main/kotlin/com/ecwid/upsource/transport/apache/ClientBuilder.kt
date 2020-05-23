package com.ecwid.upsource.transport.apache

import com.ecwid.upsource.EmptyClientBuilder
import com.ecwid.upsource.transport.UpsourceConnection

fun <T> EmptyClientBuilder<T>.withApacheHttpClient(upsourceConnection: UpsourceConnection) =
	withTransport(ApacheHttpRpcTransport(upsourceConnection))
