package ${filePackage}

<#list imports as import>
import ${import}
</#list>
import com.fasterxml.jackson.databind.Module
import com.fasterxml.jackson.databind.module.SimpleModule

fun buildUpsourceModule(): Module {
	val module = SimpleModule()
	<#list enums as enum>

	// ${enum}
	module.addDeserializer(${enum}::class.java, ${enum}Deserializer())
	module.addSerializer(${enum}Serializer())
	</#list>

	return module
}
