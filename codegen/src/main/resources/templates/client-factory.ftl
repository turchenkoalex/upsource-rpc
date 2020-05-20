package ${filePackage}

<#list services as service>
import ${rpcPackage}.${service.name}
import ${rpcPackage}.impl.${service.name}Impl
</#list>
import com.ecwid.upsource.serializer.Serializer
import com.ecwid.upsource.transport.RpcTransport

class ClientFactory {
	companion object {
		<#list services as service>
		fun new${service.name}(transport: RpcTransport, serializer: Serializer): ${service.name} {
			return ${service.name}Impl(transport, serializer)
		}
		</#list>
	}
}
