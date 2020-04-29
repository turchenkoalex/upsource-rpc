export interface UpsourceSchema {
    subpackage: string,
    package: string,
    fileName: string,
    content: UpsourceSchema
}

declare module Upsource {

    export interface Value {
        number: number;
        name: string;
        description: string;
    }

    export interface Enum {
        values: Value[];
        name: string;
        description: string;
    }

    export interface Field {
        name: string;
        description: string;
        label: string;
        type: string;
    }

    export interface Message {
        name: string;
        fields: Field[];
    }

    export interface Method {
        name: string;
        argumentType: string;
        description: string;
        returnType: string;
    }

    export interface Service {
        methods: Method[];
        name: string;
        description: string;
    }

    export interface UpsourceSchema {
        enums: Enum[] | undefined;
        messages: Message[] | undefined;
        services: Service[] | undefined;
    }
}

