package ${filePackage}

<#list imports as import>
import ${import}
</#list>

data class WebhookMetadata(
	val majorVersion: Int,
	val minorVersion: Int,
	val projectId: String,
	val dataType: String
)

sealed class Webhook {
	<#list types as type>
	data class ${type}Webhook(
		val metadata: WebhookMetadata,
		val data: ${type}
	) : Webhook()

	</#list>
	object Unknown : Webhook()
}
