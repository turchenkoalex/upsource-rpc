package com.ecwid.upsource

import com.ecwid.upsource.serializer.Serializer
import com.ecwid.upsource.transport.RpcTransport

internal typealias ClientConstructor<T> = (transport: RpcTransport, serializer: Serializer) -> T

internal class ClientBuilderImpl<T>(
	private val factory: ClientConstructor<T>
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
			?: throw IllegalArgumentException("withTransport must be invoked")

		val serializer = this.serializer
			?: throw IllegalArgumentException("withSerializer must be invoked")

		return factory(transport, serializer)
	}

	companion object {
		internal fun <T> newClientBuilder(factory: ClientConstructor<T>): EmptyClientBuilder<T> {
			return ClientBuilderImpl(factory)
		}
	}
}
