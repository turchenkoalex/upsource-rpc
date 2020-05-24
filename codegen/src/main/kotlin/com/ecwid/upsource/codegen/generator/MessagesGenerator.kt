package com.ecwid.upsource.codegen.generator

import com.ecwid.upsource.codegen.TypeMapping
import com.ecwid.upsource.codegen.filewriter.FileWriter
import com.ecwid.upsource.codegen.schema.Message
import com.ecwid.upsource.codegen.schema.UpsourceFile
import com.ecwid.upsource.codegen.templates.Template
import com.ecwid.upsource.codegen.templates.Templates

private val NATIVE_TYPE_MAP = mapOf(
	"Int32" to "Int",
	"String" to "String",
	"Bool" to "Boolean",
	"Int64" to "Long",
	"Float" to "Double"
)

class MessagesGenerator(
	private val clientDir: String,
	private val fileWriter: FileWriter,
	private val templates: Templates
) : FilesGenerator {
	override fun processFile(file: UpsourceFile, typeMapping: TypeMapping) {
		val filePackage = file.fullPackage

		file.schema.messages
			.map { message ->
				normalizeMessage(
					filePackage = filePackage,
					message = message,
					typeMapping = typeMapping
				)
			}
			.forEach { message ->
				val fileName = "${message.name}.kt"
				val content = buildContent(
					filePackage = filePackage,
					message = message
				)
				fileWriter.writeFile(
					dir = clientDir,
					filePackage = filePackage,
					filename = fileName,
					content = content
				)
			}
	}

	private fun buildContent(filePackage: String, message: Message): String {
		val template = Template.MessageTemplate(
			filePackage = filePackage,
			message = message
		)

		return templates.render(template)
	}

	private fun normalizeMessage(filePackage: String, message: Message, typeMapping: TypeMapping): Message {
		val normalizedFields = message.fields.map {
			val normalizedType = normalizeType(
				filePackage = filePackage,
				type = it.type,
				label = it.label,
				typeMapping = typeMapping
			)
			val defaultValue = buildDefaultValue(
				label = it.label,
				filePackage = filePackage,
				type = it.type,
				normalizedType = normalizedType,
				typeMapping = typeMapping
			)
			it.copy(
				type = normalizedType,
				defaultValue = defaultValue
			)
		}

		return message.copy(fields = normalizedFields)
	}

	private fun buildDefaultValue(
		label: String,
		filePackage: String,
		type: String,
		normalizedType: String,
		typeMapping: TypeMapping
	): String {
		return when (label) {
			"optional" -> "null"
			"repeated" -> "emptyList()"
			else -> when (normalizedType) {
				"Int" -> "0"
				"String" -> "\"\""
				"Boolean" -> "false"
				"Long" -> "0L"
				"Double" -> "0.0"
				else -> {
					if (typeMapping.isEnum(type)) {
						val typePackage = typeMapping.findPackage(type)
						val default = typeMapping.enumDefaultValue(type)
						if (typePackage == filePackage) {
							default
						} else {
							"$typePackage.$default"
						}
					} else {
						"${normalizedType}()"
					}
				}

			}
		}
	}

	private fun normalizeType(filePackage: String, type: String, label: String, typeMapping: TypeMapping): String {
		val nativeType = NATIVE_TYPE_MAP[type]
		if (nativeType != null) {
			return buildType(nativeType, label)
		}

		val typePackage = typeMapping.findPackage(type)
		if (filePackage == typePackage) {
			return buildType(type, label)
		}

		return buildType("$typePackage.$type", label)
	}

	private fun buildType(type: String, label: String): String {
		return when (label) {
			"required" -> type
			"optional" -> "$type?"
			"repeated" -> "List<$type>"
			else -> {
				throw IllegalArgumentException("Unknown label type $label")
			}
		}
	}
}
