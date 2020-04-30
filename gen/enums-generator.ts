import {Dirs, UpsourceData, UpsourceEnum, UpsourceEnumValue} from "./types";
import {createKtFile, enumPackage} from "./helpers";

const buildEnumValue = (value: UpsourceEnumValue): string => {
    return `
        	${value.name}(${value.number})`;
}

const buildEnum = (pkg: string, enumType: UpsourceEnum): string => {
    const values = enumType.values
        .map(buildEnumValue)
        .join(',');

    return `package ${pkg}

        /**
         * ${enumType.description}
         */
        enum class ${enumType.name}(val value: Byte) {${values};

        	companion object {
        		private val MAP_BY_VALUES = values().associateBy { it.value }
        		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
        	}
        }`;
}

export const createEnums = (dirs: Dirs, data: UpsourceData) => {
    if (!data.schema.enums) {
        return;
    }

    const pkg = enumPackage(data)

    data.schema.enums.forEach(enumType => {
        const content = buildEnum(pkg, enumType);
        createKtFile(dirs.clientDir, pkg, enumType.name, content);
    })
}
