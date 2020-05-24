package com.ecwid.upsource.serializer

import com.ecwid.upsource.rpc.projects.ReviewListDTO
import com.ecwid.upsource.rpc.projects.ReviewStateEnum
import com.ecwid.upsource.rpc.projects.RevisionReviewInfoListDTO
import com.ecwid.upsource.serializer.gson.GsonSerializer
import com.ecwid.upsource.transport.RpcResponse
import com.ecwid.upsource.transport.RpcTransportResponse
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.io.File

internal class GsonSerializerTest {
	private val serializer = GsonSerializer()

	@Test
	fun `RevisionReviewInfoListDTO deserialize test`() {
		val transportResponse = readResource("reviewInfo.json")
		val response = serializer.deserialize(transportResponse, RevisionReviewInfoListDTO::class.java)

		require(response is RpcResponse.Ok)

		val reviewInfo = response.result.reviewInfo[0].reviewInfo
		requireNotNull(reviewInfo)

		assertThat(reviewInfo.reviewId.reviewId).isEqualTo("REVIEW-ID-1")
		assertThat(reviewInfo.reviewId.projectId).isEqualTo("project")
		assertThat(reviewInfo.branch).isEqualTo(listOf("my-branch"))
		assertThat(reviewInfo.state).isEqualTo(ReviewStateEnum.OPEN)
	}

	@Test
	fun `Empty ReviewListDTO deserialize test`() {
		val transportResponse = readResource("reviewList.json")
		val response = serializer.deserialize(transportResponse, ReviewListDTO::class.java)

		require(response is RpcResponse.Ok)

		val reviewList = response.result

		assertThat(reviewList.hasMore).isEqualTo(true)
		assertThat(reviewList.totalCount).isEqualTo(101)
		assertThat(reviewList.reviews).isEmpty()
	}

	@Test
	fun `Error test`() {
		val transportResponse = readResource("error.json")
		val response = serializer.deserialize(transportResponse, ReviewListDTO::class.java)

		require(response is RpcResponse.Error)

		assertThat(response.code).isEqualTo(103)
		assertThat(response.message).isEqualTo("User guest doesn't have read access to project MyProject")
	}
}

internal fun GsonSerializerTest.readResource(file: String): RpcTransportResponse {
	val content = this.javaClass.classLoader.getResource(file).readText(Charsets.UTF_8)
	return RpcTransportResponse(statusCode = 200, content = content)
}
