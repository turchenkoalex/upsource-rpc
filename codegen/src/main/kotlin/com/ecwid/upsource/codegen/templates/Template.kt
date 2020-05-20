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

	class EnumGsonTypeAdapterTemplate(
		val filePackage: String,
		val imports: List<String>,
		val enum: EnumType
	) : Template("enum-gson-typeadapter.ftl")

	class GenericGsonBuilderTemplate(
		val filePackage: String,
		val types: List<String>
	) : Template("generic-gson-builder.ftl")

	class ClientFactoryTemplate(
		val filePackage: String,
		val rpcPackage: String,
		val services: List<Service>
	) : Template("client-factory.ftl")
}
