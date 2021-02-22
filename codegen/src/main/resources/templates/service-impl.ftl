package ${filePackage}

import ${rpcPackage}.${service.name}
import ${serializerPackage}.Serializer
import ${transportPackage}.RpcResponse
import ${transportPackage}.RpcTransport
import java.util.logging.Level
import java.util.logging.Logger

private val log = Logger.getLogger(${service.name}Impl::class.qualifiedName)

/**
 * ${service.description} implementation
 */
internal class ${service.name}Impl(
	private val transport: RpcTransport,
	private val serializer: Serializer
) : ${service.name} {

	private inline fun <reified Response> invokeMethod(methodName: String, request: Any): RpcResponse<Response> {
		val requestBody = serializer.serialize(request)
		val transportResponse = transport.makeRequest(methodName, requestBody)
		val clazz = Response::class.java
		val response = serializer.deserialize(transportResponse, clazz)
		log.log(Level.FINE, "Invoke $methodName. Request: $request. Response: $response")
		return response
	}
<#list service.methods as method>

	override fun ${method.name}(request: ${method.argumentType}): RpcResponse<${method.returnType}> {
		return invokeMethod("${method.name}", request)
	}
</#list>
${"}"}
