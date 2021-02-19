dependencies {
	api(project(":client"))
	api(com.ecwid.gradle.Dependencies.Jackson.databind)
	api(com.ecwid.gradle.Dependencies.Jackson.moduleKotlin)
}

publishing {
	publications {
		create<MavenPublication>("maven") {
			from(components["java"])
		}
	}
}
