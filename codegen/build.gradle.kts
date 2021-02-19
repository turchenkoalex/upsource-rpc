plugins {
	application
}

application {
	mainClass.set("com.ecwid.upsource.codegen.MainKt")
}

tasks.create<JavaExec>("generate") {
	group = "codegen"
	classpath = sourceSets.main.get().runtimeClasspath
	args = listOf("-rootdir", rootProject.rootDir.absolutePath)
	main = "com.ecwid.upsource.codegen.MainKt"
}

tasks.create<JavaExec>("validate") {
	group = "codegen"
	classpath = sourceSets.main.get().runtimeClasspath
	args = listOf("-rootdir", rootProject.rootDir.absolutePath, "-dryrun")
	main = "com.ecwid.upsource.codegen.MainKt"
}

tasks.check {
	dependsOn("validate")
}

dependencies {
	implementation(com.ecwid.gradle.Dependencies.gson)
	implementation(com.ecwid.gradle.Dependencies.commonsCli)
	implementation(com.ecwid.gradle.Dependencies.freemarker)
}
