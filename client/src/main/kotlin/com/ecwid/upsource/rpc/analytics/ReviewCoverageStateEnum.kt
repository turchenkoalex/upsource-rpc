// Generated by the codegen. Please DO NOT EDIT!
// source: enum.ftl

package com.ecwid.upsource.rpc.analytics

@Suppress("unused")
enum class ReviewCoverageStateEnum(val value: Byte, val originalName: String) {
	CLOSED(value = 1, originalName = "CLOSED"),
	OPEN(value = 2, originalName = "OPEN"),
	ALL(value = 3, originalName = "ALL");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
