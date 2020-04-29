plugins {
    kotlin("jvm") version "1.3.72" apply false
}

allprojects {
    group = "com.ecwid.upsource"
    version = "1.0"

    repositories {
        mavenCentral()
        jcenter()
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        sourceCompatibility = JavaVersion.VERSION_1_8.toString()
        targetCompatibility = JavaVersion.VERSION_1_8.toString()
        kotlinOptions.jvmTarget = "1.8"
    }
}

configurations.all {
    isTransitive = false
}
