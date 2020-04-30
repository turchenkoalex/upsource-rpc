import {Dirs, UpsourceData, UpsourceField, UpsourceMessage} from "./types";
import {TypeMapping} from "./type-mapping";
import {createKtFile, messagesPackage} from "./helpers";

export const createMessages = (dirs: Dirs, data: UpsourceData, mapping: TypeMapping) => {
    if (!data.schema.messages) {
        return;
    }

    const pkg = messagesPackage(data)
    data.schema.messages.forEach(message => {
        const content = buildMessage(pkg, message, mapping);
        createKtFile(dirs.clientDir, pkg, message.name, content);
    })
}

const TYPE_MAP = {
    'Int32': 'Int',
    'String': 'String',
    'Bool': 'Boolean',
    'Int64': 'Long'
}

const findType = (type: string, label: string, pkg: string, mapping: TypeMapping): string => {
    let foundType = TYPE_MAP[type];

    if (!foundType) {
        const typePackage = mapping.findPackage(type);
        if (typePackage && pkg !== typePackage) {
            foundType = `${typePackage}.${type}`
        } else {
            foundType = type;
        }
    }

    if (label === 'required') {
        return foundType;
    }

    if (label === 'optional') {
        return `${foundType}?`;
    }

    if (label === 'repeated') {
        return `List<${foundType}>`;
    }

    throw new Error(`Unknown type label ${label}`);
}

const buildField = (field: UpsourceField, pkg: string, mapping: TypeMapping): string => {
    const fieldType = findType(field.type, field.label, pkg, mapping);
    return `
        	/**
        	 * ${field.description} (${field.label})
        	 */
        	val ${field.name}: ${fieldType}`;
}

const buildMessage = (pkg: string, message: UpsourceMessage, mapping: TypeMapping): string => {
    const fields = message.fields.map(field =>
        buildField(field, pkg, mapping)
    ).join(',\n');

    return `package ${pkg}

        data class ${message.name}(${fields}
        )`;
}
