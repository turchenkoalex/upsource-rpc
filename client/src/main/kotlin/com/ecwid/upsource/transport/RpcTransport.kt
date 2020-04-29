package com.ecwid.upsource.transport

interface RpcTransport {
	fun makeRequest(methodPath: String, request: String): RpcTransportResponse
}
