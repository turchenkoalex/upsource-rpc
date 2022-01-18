plugins {
	kotlin("jvm") version com.ecwid.gradle.Versions.kotlin apply false
}

subprojects {
	group = "com.ecwid.upsource-rpc"
	version = "0.9.15"

	repositories {
		mavenCentral()
	}

	apply(plugin = "kotlin")
	apply(plugin = "java-library")
	apply(plugin = "maven-publish")

	configure<JavaPluginExtension> {
		@Suppress("UnstableApiUsage") withJavadocJar()
		@Suppress("UnstableApiUsage") withSourcesJar()
	}

	// kotlin

	dependencies {
		"implementation"(kotlin("stdlib", com.ecwid.gradle.Versions.kotlin))
		"implementation"(kotlin("reflect", com.ecwid.gradle.Versions.kotlin))
	}

	tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
		sourceCompatibility = JavaVersion.VERSION_11.toString()
		targetCompatibility = JavaVersion.VERSION_11.toString()
		kotlinOptions.jvmTarget = "11"
	}

	// junit

	dependencies {
		"testImplementation"(com.ecwid.gradle.Dependencies.JUnit.jupiterApi)
		"testRuntimeOnly"(com.ecwid.gradle.Dependencies.JUnit.jupiterEngine)
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}

	// Publishing
	configure<PublishingExtension> {
		repositories {
			maven {
				name = "GitHubPackages"
				url = java.net.URI("https://maven.pkg.github.com/turchenkoalex/upsource-rpc")
				credentials {
					username = System.getenv("GITHUB_ACTOR")
					password = System.getenv("GITHUB_TOKEN")
				}
			}
		}
	}
}
