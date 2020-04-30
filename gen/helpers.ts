import {UpsourceData} from "./types";
import * as fs from "fs";

export const ROOT_PACKAGE = 'com.ecwid.upsource';
export const RPC_PACKAGE = `${ROOT_PACKAGE}.rpc`;
export const TRANSPORT_PACKAGE = `${ROOT_PACKAGE}.transport`;
export const SERIALIZER_PACKAGE = `${ROOT_PACKAGE}.serializer`;

const indentation = (content: string) => {
    return content
        .replace(new RegExp(' {8}', 'g'), '')
        .replace(new RegExp(' {4}', 'g'), '\t');
}

export const enumPackage = (data: UpsourceData) => data.pkg

export const messagesPackage = (data: UpsourceData) => data.pkg

export const typeAdapterPackage = (data: UpsourceData) => data.pkg

export const createKtFile = (dir: string, pkg: string, fileName: string, content: string) => {
    const path = dir + '/' + pkg.replace(new RegExp('\\.', 'g'), '/');
    const indentedContent = indentation(content);
    fs.mkdirSync(path, {recursive: true});
    fs.writeFileSync(`${path}/${fileName}.kt`, indentedContent);
}
