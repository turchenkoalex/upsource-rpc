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

internal class JaksonWebhookParser : WebhookParser {
	private val objectMapper = ObjectMapper()
		.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
		.registerKotlinModule()
	private val types = ConcurrentHashMap<Class<*>, JavaType>()

	override fun parse(data: String): Webhook {
		val metadata = objectMapper.readValue(data, WebhookMetadata::class.java)
		return when (metadata.dataType) {
			<#list types as type>
			"${type}" -> {
				val type = types.computeIfAbsent(${type}::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<${type}>>(data, type)
				Webhook.${type}Webhook(metadata, webhookData.data)
			}

			</#list>
			else -> Webhook.Unknown
		}
	}
}
