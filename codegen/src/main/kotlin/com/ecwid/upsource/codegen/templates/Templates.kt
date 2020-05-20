package com.ecwid.upsource.codegen.templates

import freemarker.cache.ClassTemplateLoader
import freemarker.template.Configuration
import freemarker.template.Configuration.VERSION_2_3_30
import java.io.StringWriter

class Templates {
	private val configuration = Configuration(VERSION_2_3_30)

	init {
		configuration.defaultEncoding = "UTF-8"
		configuration.templateLoader = ClassTemplateLoader(javaClass.classLoader, "templates")
	}

	fun render(template: Template): String {
		val processor = configuration.getTemplate(template.filename)
		val writer = StringWriter()
		writer.use {
			processor.process(template, it)
		}
		return writer.toString()
	}
}
