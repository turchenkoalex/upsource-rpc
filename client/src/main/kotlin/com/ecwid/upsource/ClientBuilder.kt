package com.ecwid.upsource

import com.ecwid.upsource.serializer.Serializer
import com.ecwid.upsource.transport.RpcTransport

/**
 * Build Service RPC
 */
interface ClientBuilder<T> {
	fun build(): T
}

/**
 * Serializer setter
 */
interface ClientBuilderWithTransport<T> {
	fun withSerializer(serializer: Serializer): ClientBuilder<T>
}

/**
 * Transport setter
 */
interface EmptyClientBuilder<T> {
	fun withTransport(transport: RpcTransport): ClientBuilderWithTransport<T>
}
