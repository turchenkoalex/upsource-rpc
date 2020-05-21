package com.ecwid.upsource

import com.ecwid.upsource.serializer.Serializer
import com.ecwid.upsource.transport.RpcTransport

interface EmptyClientBuilder<T> {
	fun withTransport(transport: RpcTransport): ClientBuilderWithTransport<T>
}

interface ClientBuilderWithTransport<T> {
	fun withSerializer(serializer: Serializer): ClientBuilder<T>
}

interface ClientBuilder<T> {
	fun build(): T
}

internal typealias ClientBuilderFactory<T> = (transport: RpcTransport, serializer: Serializer) -> T

internal class ClientBuilderImpl<T>(
	private val factory: ClientBuilderFactory<T>
) : EmptyClientBuilder<T>, ClientBuilderWithTransport<T>, ClientBuilder<T> {
	private var transport: RpcTransport? = null
	private var serializer: Serializer? = null

	override fun withTransport(transport: RpcTransport): ClientBuilderImpl<T> {
		this.transport = transport
		return this
	}

	override fun withSerializer(serializer: Serializer): ClientBuilderImpl<T> {
		this.serializer = serializer
		return this
	}

	override fun build(): T {
		val transport = this.transport
		val serializer = this.serializer

		if (transport == null) {
			throw IllegalArgumentException("withTransport must be invoked")
		}

		if (serializer == null) {
			throw IllegalArgumentException("withSerializer must be invoked")
		}

		return factory(transport, serializer)
	}

	companion object {
		fun <T> newClientBuilder(factory: ClientBuilderFactory<T>): EmptyClientBuilder<T> {
			return ClientBuilderImpl(factory)
		}
	}
}
