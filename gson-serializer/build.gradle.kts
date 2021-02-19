dependencies {
	api(project(":client"))
	api(com.ecwid.gradle.Dependencies.gson)
}

publishing {
	publications {
		create<MavenPublication>("maven") {
			from(components["java"])
		}
	}
}
