package ${filePackage}

<#list imports as import>
import ${import}
</#list>
import com.ecwid.upsource.webhooks.Webhook
import com.ecwid.upsource.webhooks.WebhookMetadata
import com.ecwid.upsource.webhooks.WebhookParser
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import java.util.concurrent.ConcurrentHashMap

internal class JacksonWebhookParser : WebhookParser {
	private val objectMapper = ObjectMapper()
		.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
		.registerModule(buildUpsourceModule())
		.registerKotlinModule()
	private val types = ConcurrentHashMap${"<Class<*>, JavaType>"}()
	private val parseMapping: ${"Map<String, (WebhookMetadata, String) -> Webhook>"} = mapOf(
		<#list types as type>
		"${type}" to ::parse${type},
		</#list>
	)

	override fun parse(data: String): Webhook {
		val metadata = objectMapper.readValue(data, WebhookMetadata::class.java)
		val parser = parseMapping[metadata.dataType]
			?: return Webhook.Unknown
		return parser(metadata, data)
	}

<#list types as type>
	private fun parse${type}(
		metadata: WebhookMetadata,
		data: String
	): Webhook.${type}Webhook {
		val type = types.computeIfAbsent(${type}::class.java) {
			objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
		}
		val webhookData = objectMapper.readValue${"<WebhookData<${type}>>"}(data, type)
		return Webhook.${type}Webhook(metadata, webhookData.data)
	}

</#list>
}
