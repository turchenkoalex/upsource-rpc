package com.ecwid.upsource.codegen.templates

import com.ecwid.upsource.codegen.schema.EnumType
import com.ecwid.upsource.codegen.schema.Message
import com.ecwid.upsource.codegen.schema.Service

sealed class Template(val filename: String) {
	data class EnumTemplate(
		val filePackage: String,
		val enum: EnumType
	) : Template("enum.ftl")

	class MessageTemplate(
		val filePackage: String,
		val message: Message
	) : Template("message.ftl")

	class ServiceTemplate(
		val filePackage: String,
		val transportPackage: String,
		val service: Service
	) : Template("service.ftl")

	class ServiceImplTemplate(
		val filePackage: String,
		val rpcPackage: String,
		val transportPackage: String,
		val serializerPackage: String,
		val service: Service
	) : Template("service-impl.ftl")

	class GsonEnumTypeAdapterTemplate(
		val filePackage: String,
		val imports: List<String>,
		val enum: EnumType
	) : Template("gson-enum-typeadapter.ftl")

	class GsonGenericBuilderTemplate(
		val filePackage: String,
		val types: List<String>
	) : Template("gson-generic-builder.ftl")

	class JaksonEnumTemplate(
		val filePackage: String,
		val enum: EnumType
	) : Template("jakson-enum.ftl")

	class JaksonModuleTemplate(
		val filePackage: String,
		val enums: List<String>,
		val imports: List<String>
	) : Template("jakson-module.ftl")

	class ClientFactoryTemplate(
		val filePackage: String,
		val rpcPackage: String,
		val services: List<Service>
	) : Template("client-factory.ftl")

	class WebhookTemplate(
		val filePackage: String,
		val types: List<String>,
		val imports: List<String>
	) : Template("webhook.ftl")

	class JaksonWebhookParserTemplate(
		val filePackage: String,
		val types: List<String>,
		val imports: List<String>
	) : Template("jakson-webhook-parser.ftl")
}
