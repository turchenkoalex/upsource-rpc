package com.ecwid.upsource

import com.ecwid.upsource.rpc.UpsourceRPC
import com.ecwid.upsource.rpc.impl.UpsourceRPCImpl
import com.ecwid.upsource.serializer.Serializer
import com.ecwid.upsource.transport.RpcTransport

class ClientFactory {
	companion object {
		fun newUpsourceRPC(transport: RpcTransport, serializer: Serializer): UpsourceRPC {
			return UpsourceRPCImpl(transport, serializer)
		}
	}
}
