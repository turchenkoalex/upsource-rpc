import {UpsourceData} from "./types";
import {enumPackage, messagesPackage} from "./helpers";

export interface TypeMapping {
    findPackage(typeName: string): string | undefined;
}

const buildTypeMapping = (file: UpsourceData) => {
    const mapping = {}

    if (file.schema.enums) {
        file.schema.enums.forEach(type => {
            mapping[type.name] = enumPackage(file);
        });
    }

    if (file.schema.messages) {
        file.schema.messages.forEach(type => {
            mapping[type.name] = messagesPackage(file);
        });
    }

    return mapping;
}

export const buildMapping = (files: UpsourceData[]): TypeMapping => {
    const objMap = files
        .map(buildTypeMapping)
        .reduce(Object.assign, {});

    return {
        findPackage(typeName: string): string | undefined {
            return objMap[typeName]
        }
    }
}
