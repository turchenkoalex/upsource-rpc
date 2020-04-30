import {Dirs, UpsourceData} from "./types";
import * as fs from 'fs';
import {buildMapping, TypeMapping} from "./type-mapping";
import {createEnums} from "./enums-generator";
import {createGenericGsonBuilder, createGsonTypeAdapters} from "./gson-generator";
import {createMessages} from "./messages-generator";
import {createServices} from "./services-generator";
import {RPC_PACKAGE} from "./helpers";


const loadUpsourceData = (file: { subpackage: string, fileName: string }): UpsourceData => {
    let pkg = RPC_PACKAGE;
    if (file.subpackage) {
        pkg = `${RPC_PACKAGE}.${file.subpackage}`;
    }
    const body = fs.readFileSync(`./schemas/${file.fileName}`);
    const schema = JSON.parse(body.toString());

    return {
        fileName: file.fileName,
        pkg: pkg,
        subpackage: file.subpackage,
        schema: schema
    }
}

const loadFiles = () => {
    return [
        {
            subpackage: '',
            fileName: 'Ids.json'
        },
        {
            subpackage: `projects`,
            fileName: 'Projects.json'
        },
        {
            subpackage: `users`,
            fileName: 'Users.json'
        },
        {
            subpackage: `issuetrackers`,
            fileName: 'IssueTrackers.json'
        },
        {
            subpackage: `misc`,
            fileName: 'Misc.json'
        },
        {
            subpackage: `analytics`,
            fileName: 'Analytics.json'
        },
        {
            subpackage: `findusages`,
            fileName: 'FindUsages.json'
        },
        {
            subpackage: `files`,
            fileName: 'FileOrDirectoryContent.json'
        },
        {
            subpackage: '',
            fileName: 'Service.json'
        }
    ].map(loadUpsourceData)
}

const processFile = (dirs: Dirs, data: UpsourceData, mapping: TypeMapping) => {
    createEnums(dirs, data);
    createGsonTypeAdapters(dirs, data, mapping);
    createMessages(dirs, data, mapping);
    createServices(dirs, data, mapping);
}

const main = () => {
    console.log('Start generator')

    const dirs: Dirs = {
        clientDir: '../client/src/main/kotlin',
        gsonDir: '../gson-serializer/src/main/kotlin'
    }
    const files = loadFiles()
    const mapping = buildMapping(files)

    files.forEach(file => {
        processFile(dirs, file, mapping);
        console.log(`File ${file.fileName} processed`);
    });

    createGenericGsonBuilder(dirs, files, mapping)
}

main()
