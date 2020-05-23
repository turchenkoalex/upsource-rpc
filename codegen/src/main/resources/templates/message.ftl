<#assign has_required = message.fields?filter(f -> f.label == "required")?size gt 0>
package ${filePackage}

data class ${message.name}(
<#list message.fields as field>
	<#if field.description?has_content>
	/**
	 * ${field.description} (${field.label})
	 */
	</#if>
	val ${field.name}: ${field.type}<#if field.label != "required"> = ${field.defaultValue}</#if><#sep>,

</#sep>
</#list>

)<#if has_required> {
	internal constructor() : this(
	<#list message.fields as field>
		${field.name} = ${field.defaultValue}<#sep>,</#sep>
	</#list>
	)
}
</#if>