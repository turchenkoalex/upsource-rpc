dependencies {
	api(project(":client"))
	api(com.ecwid.gradle.Dependencies.apacheHttpClient)
}

publishing {
	publications {
		create<MavenPublication>("maven") {
			from(components["java"])
		}
	}
}
