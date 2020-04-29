plugins {
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    api(project(":client"))
    api("com.fasterxml.jackson.core:jackson-databind:2.11.0")
    api("com.fasterxml.jackson.module:jackson-module-kotlin:2.11.0")

    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.6.2")
}

tasks.test {
    useJUnitPlatform()
}
