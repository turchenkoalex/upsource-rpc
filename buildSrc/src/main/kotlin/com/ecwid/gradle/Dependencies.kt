package com.ecwid.gradle

object Versions {
	const val kotlin = "1.9.0"
	const val junit = "5.10.0"
	const val apacheHttpClient = "4.5.14"
	const val gson = "2.10.1"
	const val jackson = "2.15.2"
	const val commonsCli = "1.5.0"
	const val freemarker = "2.3.32"
	const val mockk = "1.13.7"
}

object Dependencies {
	object JUnit {
		const val jupiterApi = "org.junit.jupiter:junit-jupiter-api:${Versions.junit}"
		const val jupiterEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit}"
	}

	const val apacheHttpClient = "org.apache.httpcomponents:httpclient:${Versions.apacheHttpClient}"
	const val gson = "com.google.code.gson:gson:${Versions.gson}"

	object Jackson {
		const val databind = "com.fasterxml.jackson.core:jackson-databind:${Versions.jackson}"
		const val moduleKotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:${Versions.jackson}"
	}

	const val commonsCli = "commons-cli:commons-cli:${Versions.commonsCli}"
	const val freemarker = "org.freemarker:freemarker:${Versions.freemarker}"
	const val mockk = "io.mockk:mockk:${Versions.mockk}"
}
