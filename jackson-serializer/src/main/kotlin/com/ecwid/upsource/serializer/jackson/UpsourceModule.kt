package com.ecwid.upsource.serializer.jackson

import com.ecwid.upsource.rpc.analytics.*
import com.ecwid.upsource.rpc.fileordirectorycontent.*
import com.ecwid.upsource.rpc.issuetrackers.*
import com.ecwid.upsource.rpc.misc.*
import com.ecwid.upsource.rpc.projects.*
import com.ecwid.upsource.rpc.users.*
import com.fasterxml.jackson.databind.Module
import com.fasterxml.jackson.databind.module.SimpleModule

fun buildUpsourceModule(): Module {
	val module = SimpleModule()

	// AnalyzerProblemSeverityEnum
	module.addDeserializer(AnalyzerProblemSeverityEnum::class.java, AnalyzerProblemSeverityEnumDeserializer())
	module.addSerializer(AnalyzerProblemSeverityEnumSerializer())

	// AppConfigurationProblemEnum
	module.addDeserializer(AppConfigurationProblemEnum::class.java, AppConfigurationProblemEnumDeserializer())
	module.addSerializer(AppConfigurationProblemEnumSerializer())

	// BuildStatusEnum
	module.addDeserializer(BuildStatusEnum::class.java, BuildStatusEnumDeserializer())
	module.addSerializer(BuildStatusEnumSerializer())

	// CapabilityFlagsEnum
	module.addDeserializer(CapabilityFlagsEnum::class.java, CapabilityFlagsEnumDeserializer())
	module.addSerializer(CapabilityFlagsEnumSerializer())

	// ConflictTypeEnum
	module.addDeserializer(ConflictTypeEnum::class.java, ConflictTypeEnumDeserializer())
	module.addSerializer(ConflictTypeEnumSerializer())

	// DiffTypeEnum
	module.addDeserializer(DiffTypeEnum::class.java, DiffTypeEnumDeserializer())
	module.addSerializer(DiffTypeEnumSerializer())

	// EmailStatusEnum
	module.addDeserializer(EmailStatusEnum::class.java, EmailStatusEnumDeserializer())
	module.addSerializer(EmailStatusEnumSerializer())

	// FeedTypeEnum
	module.addDeserializer(FeedTypeEnum::class.java, FeedTypeEnumDeserializer())
	module.addSerializer(FeedTypeEnumSerializer())

	// FileWarningLevelEnum
	module.addDeserializer(FileWarningLevelEnum::class.java, FileWarningLevelEnumDeserializer())
	module.addSerializer(FileWarningLevelEnumSerializer())

	// GutterMarkEnum
	module.addDeserializer(GutterMarkEnum::class.java, GutterMarkEnumDeserializer())
	module.addSerializer(GutterMarkEnumSerializer())

	// InspectionSeverityEnum
	module.addDeserializer(InspectionSeverityEnum::class.java, InspectionSeverityEnumDeserializer())
	module.addSerializer(InspectionSeverityEnumSerializer())

	// IssueRequiredFieldTypeEnum
	module.addDeserializer(IssueRequiredFieldTypeEnum::class.java, IssueRequiredFieldTypeEnumDeserializer())
	module.addSerializer(IssueRequiredFieldTypeEnumSerializer())

	// OwnershipSummaryEnum
	module.addDeserializer(OwnershipSummaryEnum::class.java, OwnershipSummaryEnumDeserializer())
	module.addSerializer(OwnershipSummaryEnumSerializer())

	// ParticipantStateEnum
	module.addDeserializer(ParticipantStateEnum::class.java, ParticipantStateEnumDeserializer())
	module.addSerializer(ParticipantStateEnumSerializer())

	// ProjectStateEnum
	module.addDeserializer(ProjectStateEnum::class.java, ProjectStateEnumDeserializer())
	module.addSerializer(ProjectStateEnumSerializer())

	// ReadEnum
	module.addDeserializer(ReadEnum::class.java, ReadEnumDeserializer())
	module.addSerializer(ReadEnumSerializer())

	// ReviewCoverageStateEnum
	module.addDeserializer(ReviewCoverageStateEnum::class.java, ReviewCoverageStateEnumDeserializer())
	module.addSerializer(ReviewCoverageStateEnumSerializer())

	// ReviewFeedSortEnum
	module.addDeserializer(ReviewFeedSortEnum::class.java, ReviewFeedSortEnumDeserializer())
	module.addSerializer(ReviewFeedSortEnumSerializer())

	// ReviewStateEnum
	module.addDeserializer(ReviewStateEnum::class.java, ReviewStateEnumDeserializer())
	module.addSerializer(ReviewStateEnumSerializer())

	// RevisionReachabilityEnum
	module.addDeserializer(RevisionReachabilityEnum::class.java, RevisionReachabilityEnumDeserializer())
	module.addSerializer(RevisionReachabilityEnumSerializer())

	// RevisionStateEnum
	module.addDeserializer(RevisionStateEnum::class.java, RevisionStateEnumDeserializer())
	module.addSerializer(RevisionStateEnumSerializer())

	// RoleInReviewEnum
	module.addDeserializer(RoleInReviewEnum::class.java, RoleInReviewEnumDeserializer())
	module.addSerializer(RoleInReviewEnumSerializer())

	// SyncResultEnum
	module.addDeserializer(SyncResultEnum::class.java, SyncResultEnumDeserializer())
	module.addSerializer(SyncResultEnumSerializer())

	// TestConnectionStatusEnum
	module.addDeserializer(TestConnectionStatusEnum::class.java, TestConnectionStatusEnumDeserializer())
	module.addSerializer(TestConnectionStatusEnumSerializer())

	// TestPOP3MailboxStatusEnum
	module.addDeserializer(TestPOP3MailboxStatusEnum::class.java, TestPOP3MailboxStatusEnumDeserializer())
	module.addSerializer(TestPOP3MailboxStatusEnumSerializer())

	// TimeUnitEnum
	module.addDeserializer(TimeUnitEnum::class.java, TimeUnitEnumDeserializer())
	module.addSerializer(TimeUnitEnumSerializer())

	// WebhookEventEnum
	module.addDeserializer(WebhookEventEnum::class.java, WebhookEventEnumDeserializer())
	module.addSerializer(WebhookEventEnumSerializer())

	return module
}
