package com.ecwid.upsource.serializer

import com.ecwid.upsource.rpc.projects.ReviewListDTO
import com.ecwid.upsource.rpc.projects.ReviewStateEnum
import com.ecwid.upsource.rpc.projects.RevisionReviewInfoListDTO
import com.ecwid.upsource.serializer.gson.GsonSerializer
import com.ecwid.upsource.transport.RpcResponse
import com.ecwid.upsource.transport.RpcTransportResponse
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class GsonSerializerTest {
	private val serializer = GsonSerializer()

	@Test
	fun `RevisionReviewInfoListDTO deserialize test`() {
		val transportResponse = readResource("reviewInfo.json")
		val response = serializer.deserialize(transportResponse, RevisionReviewInfoListDTO::class.java)

		require(response is RpcResponse.Ok)

		val reviewInfo = response.result.reviewInfo[0].reviewInfo
		requireNotNull(reviewInfo)

		assertEquals("REVIEW-ID-1", reviewInfo.reviewId.reviewId)
		assertEquals("project", reviewInfo.reviewId.projectId)
		assertEquals(listOf("my-branch"), reviewInfo.branch)
		assertEquals(ReviewStateEnum.OPEN, reviewInfo.state)
	}

	@Test
	fun `Empty ReviewListDTO deserialize test`() {
		val transportResponse = readResource("reviewList.json")
		val response = serializer.deserialize(transportResponse, ReviewListDTO::class.java)

		require(response is RpcResponse.Ok)

		val reviewList = response.result

		assertTrue(reviewList.hasMore)
		assertEquals(101, reviewList.totalCount)
		assertTrue(reviewList.reviews.isEmpty())
	}

	@Test
	fun `Error test`() {
		val transportResponse = readResource("error.json")
		val response = serializer.deserialize(transportResponse, ReviewListDTO::class.java)

		require(response is RpcResponse.Error)

		assertEquals(103, response.code)
		assertEquals("User guest doesn't have read access to project MyProject", response.message)
	}
}

internal fun GsonSerializerTest.readResource(file: String): RpcTransportResponse {
	@Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
	val content = this.javaClass.classLoader.getResource(file).readText(Charsets.UTF_8)
	return RpcTransportResponse(statusCode = 200, content = content)
}
