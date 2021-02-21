package com.ecwid.upsource.codegen

private val UPSOURCE_CLIENT_JSON_FILES = listOf(
	"Ids.json",
	"Projects.json",
	"Users.json",
	"IssueTrackers.json",
	"Misc.json",
	"Analytics.json",
	"FindUsages.json",
	"FileOrDirectoryContent.json",
	"Service.json"
)

private val UPSOURCE_WEBHOOK_JSON_FILES = listOf(
	"Events.json"
)

fun main(args: Array<String>) {
	System.setProperty("java.util.logging.SimpleFormatter.format", "[%1\$tF %1\$tT] [%4\$s] %5\$s%n")

	val config = parseArgs(args)

	val generator = if (config.dryRun) {
		DryRunGeneratorRunner(
			clientJsonFiles = UPSOURCE_CLIENT_JSON_FILES,
			webhooksJsonFiles = UPSOURCE_WEBHOOK_JSON_FILES
		)
	} else {
		DiskGeneratorRunner(
			clientJsonFiles = UPSOURCE_CLIENT_JSON_FILES,
			webhooksJsonFiles = UPSOURCE_WEBHOOK_JSON_FILES
		)
	}

	generator.run(config)
}

