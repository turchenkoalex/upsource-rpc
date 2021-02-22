package com.ecwid.upsource.codegen.generator

import com.ecwid.upsource.codegen.TypeMapping
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DescriptionUtilKtTest {
	private val typeMapping = mockk<TypeMapping>()

	@Test
	fun `See description must be added as @see annotation`() {
		every { typeMapping.findPackage(any()) } returns null

		val actual = "See RevisionExternalInspectionsDiffResponseDTO (repeated)".addSeeAnnotationsIfRequired(typeMapping)
		assertEquals(
			"See RevisionExternalInspectionsDiffResponseDTO (repeated)\n\n@see RevisionExternalInspectionsDiffResponseDTO",
			actual
		)
	}

	@Test
	fun `See description must be added as @see annotation with package`() {
		every { typeMapping.findPackage("RevisionExternalInspectionsDiffResponseDTO") } returns "com.ecwid.testpackage"

		val actual = "See RevisionExternalInspectionsDiffResponseDTO (repeated)".addSeeAnnotationsIfRequired(typeMapping)
		assertEquals(
			"See RevisionExternalInspectionsDiffResponseDTO (repeated)\n\n@see com.ecwid.testpackage.RevisionExternalInspectionsDiffResponseDTO",
			actual
		)
	}

	@Test
	fun `Add double see annotation`() {
		every { typeMapping.findPackage(any()) } returns null
		val actual = "GitHub sync result. See SyncResultEnum parameters (optional) See Some".addSeeAnnotationsIfRequired(typeMapping)
		assertEquals(
			"GitHub sync result. See SyncResultEnum parameters (optional) See Some\n\n@see SyncResultEnum\n@see Some",
			actual
		)
	}

	@Test
	fun `No see annotation`() {
		every { typeMapping.findPackage(any()) } returns null
		val actual = "GitHub sync result.".addSeeAnnotationsIfRequired(typeMapping)
		assertEquals("GitHub sync result.", actual)
	}
}
