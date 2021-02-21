<#assign has_required = message.fields?filter(f -> f.label == "required")?size gt 0>
package ${filePackage}

/**
<#list message.fields as field>
 * @param ${field.name} ${field.description!""}
</#list>
 */
@Suppress("unused")
data class ${message.name}(
<#list message.fields as field>
	<#if field.normalizedDescription?has_content>
	/**
	<#list field.normalizedDescription?split("\n") as descriptionLine>
	 * ${descriptionLine}
	</#list>
	 */
	</#if>
	val ${field.name}: ${field.type}<#if field.label != "required"> = ${field.defaultValue}</#if><#sep>,

</#sep>
</#list>

)<#if has_required> {
	@Suppress("unused")
	internal constructor() : this(
	<#list message.fields as field>
		${field.name} = ${field.defaultValue}<#sep>,</#sep>
	</#list>
	)
}
</#if>

