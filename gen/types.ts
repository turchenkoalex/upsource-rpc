export interface UpsourceData {
    subpackage: string,
    pkg: string,
    fileName: string,
    schema: UpsourceSchema
}

export interface Dirs {
    clientDir: string,
    gsonDir: string
}

export interface UpsourceEnumValue {
    number: number;
    name: string;
    description: string;
}

export interface UpsourceEnum {
    values: UpsourceEnumValue[];
    name: string;
    description: string;
}

export interface UpsourceField {
    name: string;
    description: string;
    label: string;
    type: string;
}

export interface UpsourceMessage {
    name: string;
    fields: UpsourceField[];
}

export interface UpsourceMethod {
    name: string;
    argumentType: string;
    description: string;
    returnType: string;
}

export interface UpsourceService {
    methods: UpsourceMethod[];
    name: string;
    description: string;
}

export interface UpsourceSchema {
    enums: UpsourceEnum[] | undefined;
    messages: UpsourceMessage[] | undefined;
    services: UpsourceService[] | undefined;
}

