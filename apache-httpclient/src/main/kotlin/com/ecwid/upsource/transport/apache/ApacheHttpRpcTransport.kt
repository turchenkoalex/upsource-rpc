package com.ecwid.upsource.transport.apache

import com.ecwid.upsource.transport.RpcTransport
import com.ecwid.upsource.transport.RpcTransportResponse
import com.ecwid.upsource.transport.UpsourceConnection
import org.apache.http.HttpHeaders
import org.apache.http.client.config.RequestConfig
import org.apache.http.client.methods.RequestBuilder
import org.apache.http.entity.StringEntity
import org.apache.http.impl.client.HttpClientBuilder
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager
import org.apache.http.util.EntityUtils
import java.time.Duration
import java.util.*

private val CONNECTION_TIMEOUT = Duration.ofSeconds(10).toMillis().toInt()
private val READ_TIMEOUT = Duration.ofSeconds(5).toMillis().toInt()
private const val MAX_CONNECTIONS = 10

class ApacheHttpRpcTransport(
	private val upsourceConnection: UpsourceConnection
) : RpcTransport {

	private val httpClient: org.apache.http.client.HttpClient

	init {
		val connectionManager = PoolingHttpClientConnectionManager().apply {
			maxTotal = MAX_CONNECTIONS
			defaultMaxPerRoute = MAX_CONNECTIONS
		}

		val requestConfig = RequestConfig.custom()
			.setConnectTimeout(CONNECTION_TIMEOUT)
			.setConnectionRequestTimeout(CONNECTION_TIMEOUT)
			.setSocketTimeout(READ_TIMEOUT)
			.build()

		httpClient = HttpClientBuilder.create()
			.setConnectionManager(connectionManager)
			.setDefaultRequestConfig(requestConfig)
			.build()
	}

	override fun makeRequest(methodPath: String, request: String): RpcTransportResponse {
		val httpRequest = RequestBuilder
			.post("${upsourceConnection.serverUrl}/~rpc/$methodPath")
			.setEntity(StringEntity(request, Charsets.UTF_8))
			.setHeader(
				HttpHeaders.AUTHORIZATION,
				basicAuthorizationHeader(
					username = upsourceConnection.username,
					password = upsourceConnection.password
				)
			)
			.build()

		return httpClient.execute(httpRequest) { response ->
			val statusCode = response.statusLine.statusCode
			val content = EntityUtils.toString(response.entity)
			RpcTransportResponse(
				statusCode = statusCode,
				content = content
			)
		}
	}
}

private fun basicAuthorizationHeader(username: String, password: String): String {
	return "Basic " + Base64.getEncoder().encodeToString("$username:$password".toByteArray())
}
