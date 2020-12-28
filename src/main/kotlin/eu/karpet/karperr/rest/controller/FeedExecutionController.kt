package eu.karpet.karperr.rest.controller

import eu.karpet.karperr.service.FeedExecutionService
import mu.KotlinLogging
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

private val logger = KotlinLogging.logger {}

/**
 * Controller to execute feeds.
 */
@RestController
class FeedExecutionController(val feedExecutionService: FeedExecutionService) {

    @GetMapping("/api/feed/execute/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun execute(@PathVariable id: String): String? {
        logger.debug { "Feed execution request accepted." }
        return feedExecutionService.execute(id)
    }

}
