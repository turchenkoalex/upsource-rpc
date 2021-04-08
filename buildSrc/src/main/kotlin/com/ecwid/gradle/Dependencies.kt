package com.ecwid.gradle

object Versions {
	const val kotlin = "1.4.32"
	const val junit = "5.7.1"
	const val apacheHttpClient = "4.5.13"
	const val gson = "2.8.6"
	const val jackson = "2.12.1"
	const val commonsCli = "1.4"
	const val freemarker = "2.3.31"
	const val mockk = "1.10.6"
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
