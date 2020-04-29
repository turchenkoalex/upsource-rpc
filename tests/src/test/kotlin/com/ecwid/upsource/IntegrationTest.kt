package com.ecwid.upsource

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import com.ecwid.upsource.rpc.projects.RevisionListDTO
import com.ecwid.upsource.serializer.GsonSerializer
import com.ecwid.upsource.transport.ApacheHttpRpcTransport
import com.ecwid.upsource.transport.HttpRpcTransport
import com.ecwid.upsource.transport.RpcResponse
import com.ecwid.upsource.transport.UpsourceConnection

internal class IntegrationTest {
	private val upsourceConnection = UpsourceConnection(
		serverUrl = System.getenv("UPSOURCE_URL"),
		username = System.getenv("UPSOURCE_USER"),
		password = System.getenv("UPSOURCE_PASSWORD")
	)

	@Test
	fun `Gson and java httpclient test`() {
		val transport = HttpRpcTransport(upsourceConnection)
		val serializer = GsonSerializer()
		val client = ClientFactory.newUpsourceRPC(transport, serializer)

		val revisionList = client.getRevisionReviewInfo(
			RevisionListDTO(
				projectId = "project",
				revisionId = listOf("revision_id")
			)
		)

		require(revisionList is RpcResponse.Error)
		assertThat(revisionList.code).isEqualTo(2001)
	}

	@Test
	fun `Gson and apache httpclient test`() {
		val transport = ApacheHttpRpcTransport(upsourceConnection)
		val serializer = GsonSerializer()
		val client = ClientFactory.newUpsourceRPC(transport, serializer)

		val revisionList = client.getRevisionReviewInfo(
			RevisionListDTO(
				projectId = "project",
				revisionId = listOf("revision_id")
			)
		)

		require(revisionList is RpcResponse.Error)
		assertThat(revisionList.code).isEqualTo(2001)
	}
}
