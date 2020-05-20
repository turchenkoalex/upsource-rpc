package com.ecwid.upsource.codegen

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class StringUtilsKtTest {
	@Test
	fun snakeCaseTest() {
		val cases = listOf(
			"ONE" to "one",
			"one" to "one",
			"ONE_TWO" to "one_two",
			"One" to "one",
			"OneTwo" to "one_two",
			"OneTwoThree" to "one_two_three",
			"canGotoDeclaration" to "can_goto_declaration"
		)

		cases.forEach { (value, expected) ->
			val actual = snakeCase(value)
			assertEquals(expected, actual)
		}
	}
}
