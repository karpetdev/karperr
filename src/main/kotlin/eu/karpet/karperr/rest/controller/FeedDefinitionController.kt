package eu.karpet.karperr.rest.controller

import eu.karpet.karperr.domain.FeedDefinition
import eu.karpet.karperr.service.FeedDefinitionService
import mu.KotlinLogging
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

private val logger = KotlinLogging.logger {}

/**
 * Controller to access feed definitions.
 */
@RestController
class FeedDefinitionController(val feedDefinitionService: FeedDefinitionService) {

    @GetMapping("/api/feed/definition")
    @ResponseStatus(HttpStatus.OK)
    fun getAll(): Mono<List<FeedDefinition>>? {
        logger.debug { "Feed definition request accepted." }
        return feedDefinitionService.getAll()
    }

}