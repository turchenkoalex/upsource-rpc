package com.ecwid.upsource

import com.ecwid.upsource.rpc.UpsourceRPC
import com.ecwid.upsource.serializer.Serializer
import com.ecwid.upsource.transport.RpcTransport

/**
 * Service RPC builders
 */
class ClientFactory {
	companion object {
		fun newUpsourceRPC(transport: RpcTransport, serializer: Serializer): UpsourceRPC {
			return UpsourceRPC.newBuilder()
				.withTransport(transport)
				.withSerializer(serializer)
				.build()
		}
	}
}
