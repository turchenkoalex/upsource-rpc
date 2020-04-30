import {Dirs, UpsourceData, UpsourceMethod, UpsourceService} from "./types";
import {TypeMapping} from "./type-mapping";
import {createKtFile, RPC_PACKAGE, SERIALIZER_PACKAGE, TRANSPORT_PACKAGE} from "./helpers";

export const createServices = (dirs: Dirs, data: UpsourceData, mapping: TypeMapping) => {
    if (!data.schema.services) {
        return;
    }

    const pkg = data.pkg;
    const implPackage = `${pkg}.impl`;

    data.schema.services.forEach(service => {
        const serviceContent = buildService(pkg, service, mapping);
        const serviceImplContent = buildServiceImpl(implPackage, service, mapping);

        createKtFile(dirs.clientDir, pkg, service.name, serviceContent);
        createKtFile(dirs.clientDir, implPackage, `${service.name}Impl`, serviceImplContent);
    })
}

const findArgumentType = (typeName: string, pkg, mapping: TypeMapping): string => {
    const cleanName = typeName.replace('messages.', '');
    const typePackage = mapping.findPackage(cleanName);

    if (!!typePackage && typePackage !== pkg) {
        return `${typePackage}.${cleanName}`;
    }

    return cleanName;
}

const buildMethod = (method: UpsourceMethod, pkg: string, mapping: TypeMapping): string => {
    const argumentType = findArgumentType(method.argumentType, pkg, mapping);
    const returnType = findArgumentType(method.returnType, pkg, mapping);
    return `
            /**
             * ${method.description}
             */
            fun ${method.name}(request: ${argumentType}): RpcResponse<${returnType}>`;
}

const buildMethodImpl = (method: UpsourceMethod, pkg: string, mapping: TypeMapping) => {
    const argumentType = findArgumentType(method.argumentType, pkg, mapping);
    const returnType = findArgumentType(method.returnType, pkg, mapping);
    return `
            override fun ${method.name}(request: ${argumentType}): RpcResponse<${returnType}> {
            	val body = serializer.serialize(request)
            	val transportResponse = transport.makeRequest("${method.name}", body)
            	val clazz = ${returnType}::class.java
            	return serializer.deserialize(transportResponse, clazz)
            }`;
}

const buildService = (pkg: string, service: UpsourceService, mapping: TypeMapping): string => {
    const methods = service.methods.map(method =>
        buildMethod(method, pkg, mapping)
    ).join('\n')

    return `package ${pkg}

        import ${TRANSPORT_PACKAGE}.RpcResponse

        /**
         * ${service.description}
         */
        interface ${service.name} {
${methods}
        }
        `;
}

const buildServiceImpl = (pkg: string, service: UpsourceService, mapping: TypeMapping) => {
    const methods = service.methods.map(method =>
        buildMethodImpl(method, pkg, mapping)
    ).join('\n')

    return `package ${pkg}

        import ${RPC_PACKAGE}.UpsourceRPC
        import ${SERIALIZER_PACKAGE}.Serializer
        import ${TRANSPORT_PACKAGE}.RpcResponse
        import ${TRANSPORT_PACKAGE}.RpcTransport

        /**
         * ${service.description} implementation
         */
        internal class ${service.name}Impl(
        	private val transport: RpcTransport,
        	private val serializer: Serializer
        ) : ${service.name} {
${methods}
        }
        `;
}



