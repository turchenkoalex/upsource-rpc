plugins {
	kotlin("jvm")
}

dependencies {
}

publishing {
	publications {
		create<MavenPublication>("maven") {
			from(components["java"])
		}
	}
}
