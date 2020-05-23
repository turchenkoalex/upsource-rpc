package com.ecwid.upsource.codegen

import org.apache.commons.cli.*
import java.io.File
import java.nio.file.Path
import kotlin.system.exitProcess

fun parseArgs(args: Array<String>): Config {
	val options = Options()

	val rootDirOption = Option.builder("rootdir")
		.hasArg()
		.argName("dir")
		.desc("Root directory of project for store generated code")
		.required()
		.build()

	val dryRunOption = Option.builder("dryrun")
		.desc("Dry run for detect changes in generated code")
		.build()

	options.addOption(rootDirOption)
	options.addOption(dryRunOption)

	val parser = DefaultParser()
	val cmd =
		try {
			parser.parse(options, args)
		} catch (e: MissingOptionException) {
			val formatter = HelpFormatter()
			formatter.printHelp("codegen", options)
			exitProcess(1)
		}

	val rootDir = cmd.getOptionValue(rootDirOption.opt)
	val dryRun = cmd.hasOption(dryRunOption.opt)

	val config = Config(
		clientDir = Path.of(rootDir, "client", "src", "main", "kotlin").toString(),
		gsonLibraryDir = Path.of(rootDir, "gson-serializer", "src", "main", "kotlin").toString(),
		jaksonLibraryDir = Path.of(rootDir, "jakson-serializer", "src", "main", "kotlin").toString(),
		dryRun = dryRun
	)

	if (!File(config.clientDir).isDirectory) {
		println("$config.clientDir not a directory")
		exitProcess(1)
	}

	return config
}
