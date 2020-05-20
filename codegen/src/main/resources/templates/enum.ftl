package ${filePackage}

<#if enum.description?has_content>
/**
 * ${enum.description}
 */
</#if>
enum class ${enum.name}(val value: Byte, val originalName: String) {
<#list enum.values as value>
	${value.name}(value = ${value.number}, originalName = "${value.originalName}")<#sep>,
</#sep></#list>;

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
