// Generated by the codegen. Please DO NOT EDIT!
// source: jackson-module.ftl

package com.ecwid.upsource.webhooks.jackson

import com.ecwid.upsource.rpc.events.*
import com.fasterxml.jackson.databind.Module
import com.fasterxml.jackson.databind.module.SimpleModule

fun buildUpsourceModule(): Module {
	val module = SimpleModule()

	// NotificationReason
	module.addDeserializer(NotificationReason::class.java, NotificationReasonDeserializer())
	module.addSerializer(NotificationReasonSerializer())

	// ParticipantRole
	module.addDeserializer(ParticipantRole::class.java, ParticipantRoleDeserializer())
	module.addSerializer(ParticipantRoleSerializer())

	// ParticipantState
	module.addDeserializer(ParticipantState::class.java, ParticipantStateDeserializer())
	module.addSerializer(ParticipantStateSerializer())

	// ReviewState
	module.addDeserializer(ReviewState::class.java, ReviewStateDeserializer())
	module.addSerializer(ReviewStateSerializer())

	return module
}
