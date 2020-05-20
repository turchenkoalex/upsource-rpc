package com.ecwid.upsource.codegen

import com.ecwid.upsource.codegen.filewriter.DiskFileWriter
import com.ecwid.upsource.codegen.filewriter.DryRunFileWriter
import com.ecwid.upsource.codegen.generator.CodeGenerator
import com.ecwid.upsource.codegen.resources.Resources
import com.ecwid.upsource.codegen.templates.Templates
import java.util.logging.Logger
import kotlin.system.exitProcess

private val log = Logger.getLogger("codegen")

fun main(args: Array<String>) {
	System.setProperty("java.util.logging.SimpleFormatter.format", "[%1\$tF %1\$tT] [%4\$s] %5\$s%n")

	val config = parseArgs(args)

	log.info("Start generator with config $config")

	val dryRunFileWriter = DryRunFileWriter()
	val fileWriter = if (config.dryRun) {
		dryRunFileWriter
	} else {
		DiskFileWriter()
	}

	val codeGenerator = CodeGenerator(
		config = config,
		templates = Templates(),
		fileWriter = fileWriter
	)

	val filenames = listOf(
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

	val upsourceFileLoader = UpsourceFileLoader(Resources())
	val files = filenames.map(upsourceFileLoader::loadUpsourceFile)

	codeGenerator.generate(files)

	if (!config.dryRun) {
		log.info("All files generated")
		return
	}

	if (dryRunFileWriter.hasChanges()) {
		log.warning("Dry run failed:")
		log.warning(dryRunFileWriter.report())
		exitProcess(1)
	} else {
		log.info("No changes detected")
	}
}
