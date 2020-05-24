package com.ecwid.upsource

import com.ecwid.upsource.rpc.UpsourceRPC
import com.ecwid.upsource.rpc.projects.ReviewDescriptorDTO
import com.ecwid.upsource.rpc.projects.ReviewStateEnum
import com.ecwid.upsource.rpc.projects.ReviewsRequestDTO
import com.ecwid.upsource.rpc.projects.RevisionListDTO
import com.ecwid.upsource.serializer.gson.withGsonSerializer
import com.ecwid.upsource.serializer.jakson.withJaksonSerializer
import com.ecwid.upsource.transport.RpcResponse
import com.ecwid.upsource.transport.UpsourceConnection
import com.ecwid.upsource.transport.apache.withApacheHttpClient
import com.ecwid.upsource.transport.httpclient.withHttpClient
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationTest {
	private val upsourceConnection = UpsourceConnection(
		serverUrl = System.getenv("UPSOURCE_URL"),
		username = System.getenv("UPSOURCE_USER"),
		password = System.getenv("UPSOURCE_PASSWORD")
	)

	private val demoProjectId = System.getenv("DEMO_PROJECT_ID")

	@Test
	fun `Gson and java httpclient test`() {
		val client = UpsourceRPC.newBuilder()
			.withHttpClient(upsourceConnection)
			.withGsonSerializer()
			.build()

		val revisionList = client.getRevisionReviewInfo(
			RevisionListDTO(
				projectId = "unknown-project",
				revisionId = listOf("test-revision-id")
			)
		)

		require(revisionList is RpcResponse.Error)
		assertThat(revisionList.code).isEqualTo(2001)
	}

	@Test
	fun `Jakson and apache httpclient test`() {
		val client = UpsourceRPC.newBuilder()
			.withApacheHttpClient(upsourceConnection)
			.withJaksonSerializer()
			.build()

		val revisionList = client.getRevisionReviewInfo(
			RevisionListDTO(
				projectId = "unknown-project",
				revisionId = listOf("test-revision-id")
			)
		)

		require(revisionList is RpcResponse.Error)
		assertThat(revisionList.code).isEqualTo(2001)
	}

	@Test
	fun `Fetch all opened reviews test`() {
		val client = UpsourceRPC.newBuilder()
			.withHttpClient(upsourceConnection)
			.withJaksonSerializer()
			.build()

		val openedReviews = client
			.fetchReviews(
				project = demoProjectId,
				query = "state: open"
			)
			.take(15)
			.toList() // materialize

		val closedReviews = client
			.fetchReviews(
				project = demoProjectId,
				query = "state: closed"
			)
			.take(15)
			.toList() // materialize

		openedReviews.forEach {
			require(it.state == ReviewStateEnum.OPEN)
		}

		closedReviews.forEach {
			require(it.state == ReviewStateEnum.CLOSED)
		}
	}
}

/**
 * Fetch reviews by query
 */
private fun UpsourceRPC.fetchReviews(project: String, query: String): Sequence<ReviewDescriptorDTO> {
	var offset = 0
	val limit = 10
	val client = this
	return sequence {
		while (true) {
			val request = ReviewsRequestDTO(
				projectId = project,
				query = query,
				limit = limit,
				skip = offset
			)

			when (val response = client.getReviews(request)) {
				is RpcResponse.Ok -> {

					yieldAll(response.result.reviews)
					offset += limit

					if (response.result.reviews.size < limit || response.result.reviews.isEmpty()) {
						return@sequence
					}
				}

				is RpcResponse.Error -> {
					throw IllegalStateException("Response error: $response")
				}
			}
		}
	}
}
