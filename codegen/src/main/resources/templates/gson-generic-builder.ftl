package ${filePackage}

import com.google.gson.GsonBuilder

private val adapters = listOf(
<#list types as type>
	${type}::class.java to ${type}TypeAdapter(),
</#list>
)

internal fun genericGsonBuilder(): GsonBuilder {
	return GsonBuilder().apply {
		adapters.forEach { (clazz, adapter) ->
			registerTypeAdapter(clazz, adapter)
		}
	}
}
