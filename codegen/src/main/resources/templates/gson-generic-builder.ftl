package ${filePackage}

import com.google.gson.GsonBuilder

internal fun genericGsonBuiler(): GsonBuilder {
	return GsonBuilder()
<#list types as type>
		.registerTypeAdapter(
			${type}::class.java,
			${type}TypeAdapter()
		)
</#list>
}
