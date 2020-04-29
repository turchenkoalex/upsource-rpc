package com.ecwid.upsource.rpc.misc

data class TestPOP3MailboxRequestDTO(
	/**
	 * Protocol type ("POP3", "POP3+SSL", "POP3+TLS") (required)
	 */
	val protocol: String,

	/**
	 * Email service host name (required)
	 */
	val host: String,

	/**
	 * Email server port number (required)
	 */
	val port: Int,

	/**
	 * Email login (required)
	 */
	val login: String,

	/**
	 * Email password (required)
	 */
	val password: String
)