package com.ecwid.upsource.transport.httpclient

import com.ecwid.upsource.transport.RpcTransport
import com.ecwid.upsource.transport.RpcTransportResponse
import com.ecwid.upsource.transport.UpsourceConnection
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.time.Duration
import java.util.*
import java.util.logging.Level
import java.util.logging.Logger

private val log = Logger.getLogger(HttpRpcTransport::class.qualifiedName)

class HttpRpcTransport(
	private val upsourceConnection: UpsourceConnection,
	private val client: HttpClient
) : RpcTransport {

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

		val body = httpResponse.body()
		log.log(Level.FINE, "Http response ${httpResponse.statusCode()}: $body")

		return RpcTransportResponse(
			statusCode = httpResponse.statusCode(),
			content = body
		)
	}

	companion object {
		internal fun newTransport(upsourceConnection: UpsourceConnection): HttpRpcTransport {
			val client = HttpClient.newBuilder()
				.connectTimeout(Duration.ofSeconds(10))
				.build()

			return HttpRpcTransport(upsourceConnection, client)
		}
	}
}

private fun basicAuthorizationHeader(username: String, password: String): String {
	return "Basic " + Base64.getEncoder().encodeToString("$username:$password".toByteArray())
}
