package com.ecwid.upsource.transport

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.time.Duration
import java.util.*

class HttpRpcTransport(private val upsourceConnection: UpsourceConnection) : RpcTransport {
	private val client = HttpClient.newBuilder()
		.connectTimeout(Duration.ofSeconds(10))
		.build()

	override fun makeRequest(methodPath: String, request: String): RpcTransportResponse {
		val httpRequest = HttpRequest.newBuilder()
			.POST(HttpRequest.BodyPublishers.ofString(request))
			.header(
				"Authorization",
				basicAuthorizationHeader(
					username = upsourceConnection.username,
					password = upsourceConnection.password
				)
			)
			.uri(URI.create("${upsourceConnection.serverUrl}/~rpc/$methodPath"))
			.build()

		val httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers.ofString())

		return RpcTransportResponse(
			statusCode = httpResponse.statusCode(),
			content = httpResponse.body()
		)
	}
}

private fun basicAuthorizationHeader(username: String, password: String): String {
	return "Basic " + Base64.getEncoder().encodeToString("$username:$password".toByteArray())
}
