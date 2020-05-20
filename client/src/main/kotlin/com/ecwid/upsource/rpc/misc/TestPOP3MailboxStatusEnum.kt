package com.ecwid.upsource.rpc.misc

/**
 * Describes connection status
 */
enum class TestPOP3MailboxStatusEnum(val value: Byte, val originalName: String) {
	OK(value = 1, originalName = "OK"),
	LOGIN_FAILED(value = 2, originalName = "LoginFailed"),
	CONNECTION_FAILED(value = 3, originalName = "ConnectionFailed");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
