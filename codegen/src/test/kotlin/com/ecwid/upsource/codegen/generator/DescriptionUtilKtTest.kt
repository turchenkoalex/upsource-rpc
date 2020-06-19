package com.ecwid.upsource.codegen.generator

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DescriptionUtilKtTest {
	@Test
	fun `See description must be added as @see annotation`() {
		val actual = "See RevisionExternalInspectionsDiffResponseDTO (repeated)".addSeeAnnotationsIfRequired()
		assertEquals(
			"See RevisionExternalInspectionsDiffResponseDTO (repeated)\n\n@see RevisionExternalInspectionsDiffResponseDTO",
			actual
		)
	}

	@Test
	fun `Add double see annotation`() {
		val actual = "GitHub sync result. See SyncResultEnum parameters (optional) See Some".addSeeAnnotationsIfRequired()
		assertEquals(
			"GitHub sync result. See SyncResultEnum parameters (optional) See Some\n\n@see SyncResultEnum\n@see Some",
			actual
		)
	}

	@Test
	fun `No see annotation`() {
		val actual = "GitHub sync result.".addSeeAnnotationsIfRequired()
		assertEquals("GitHub sync result.", actual)
	}
}
