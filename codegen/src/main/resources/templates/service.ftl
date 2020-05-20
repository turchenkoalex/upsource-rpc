package ${filePackage}

import com.ecwid.upsource.ClientBuilderImpl
import com.ecwid.upsource.EmptyClientBuilder
import ${transportPackage}.RpcResponse

/**
 * ${service.description}
 */
interface ${service.name} {
<#list service.methods as method>

	<#if method.description?has_content>
	/**
	 * ${method.description}
	 */
	</#if>
	fun ${method.name}(request: ${method.argumentType}): RpcResponse<${method.returnType}>
</#list>

	companion object {
		fun newBuilder(): EmptyClientBuilder<${service.name}> {
			return ClientBuilderImpl.newClientBuilder { transport, serializer ->
				${filePackage}.impl.${service.name}Impl(transport, serializer)
			}
		}
	}

}
