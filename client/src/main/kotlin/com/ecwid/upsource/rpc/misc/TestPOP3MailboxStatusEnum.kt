package com.ecwid.upsource.rpc.misc

/**
 * Describes connection status
 */
enum class TestPOP3MailboxStatusEnum(val value: Byte) {
	OK(1),
	LoginFailed(2),
	ConnectionFailed(3);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}