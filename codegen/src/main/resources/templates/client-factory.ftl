package ${filePackage}

<#list services as service>
import ${rpcPackage}.${service.name}
</#list>
import com.ecwid.upsource.serializer.Serializer
import com.ecwid.upsource.transport.RpcTransport

/**
 * Service RPC builders
 */
class ClientFactory {
	companion object {
		<#list services as service>
		fun new${service.name}(transport: RpcTransport, serializer: Serializer): ${service.name} {
			return ${service.name}.newBuilder()
				.withTransport(transport)
				.withSerializer(serializer)
				.build()
		}
		</#list>
	}
}
