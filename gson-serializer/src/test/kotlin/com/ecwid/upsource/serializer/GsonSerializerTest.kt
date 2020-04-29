package com.ecwid.upsource.serializer

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import com.ecwid.upsource.rpc.projects.ReviewStateEnum
import com.ecwid.upsource.rpc.projects.RevisionReviewInfoListDTO
import com.ecwid.upsource.transport.RpcResponse
import com.ecwid.upsource.transport.RpcTransportResponse
import java.io.File

internal class GsonSerializerTest {
	@Test
	fun `RevisionReviewInfoListDTO deserialize test`() {
		val serializer = GsonSerializer()
		val transportResponse = readTransportResponse("reviewInfo.json")
		val response = serializer.deserialize(transportResponse, RevisionReviewInfoListDTO::class.java)

		require(response is RpcResponse.Ok)

		val reviewInfo = response.result.reviewInfo[0].reviewInfo
		requireNotNull(reviewInfo)

		assertThat(reviewInfo.reviewId.reviewId).isEqualTo("REVIEW-ID-1")
		assertThat(reviewInfo.reviewId.projectId).isEqualTo("project")
		assertThat(reviewInfo.branch).isEqualTo(listOf("my-branch"))
		assertThat(reviewInfo.state).isEqualTo(ReviewStateEnum.Open)
	}

	private fun readTransportResponse(fileName: String): RpcTransportResponse {
		val file = File(this.javaClass.classLoader.getResource(fileName).file)
		if (file.exists()) {
			val content = file.readText()
			return RpcTransportResponse(statusCode = 200, content = content)
		}

		return RpcTransportResponse(statusCode = 404, content = "")
	}
}
