// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.misc

/**
 * @param protocol Protocol type ("POP3", "POP3+SSL", "POP3+TLS")
 * @param host Email service host name
 * @param port Email server port number
 * @param login Email login
 * @param password Email password
 */
@Suppress("unused")
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
) {
	@Suppress("unused")
	internal constructor() : this(
		protocol = "",
		host = "",
		port = 0,
		login = "",
		password = ""
	)
}

