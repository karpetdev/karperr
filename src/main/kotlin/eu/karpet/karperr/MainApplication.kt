package eu.karpet.karperr

import mu.KotlinLogging
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

private val logger = KotlinLogging.logger {}

/**
 * Main entrypoint of the application.
 */
@SpringBootApplication
class MainApplication

fun main(args: Array<String>) {
	logger.info { "Application has started." }
	runApplication<MainApplication>(*args)
}
