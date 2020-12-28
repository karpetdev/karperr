package eu.karpet.karperr.rest.controller

import eu.karpet.karperr.domain.FeedDefinition
import eu.karpet.karperr.service.FeedDefinitionService
import mu.KotlinLogging
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

private val logger = KotlinLogging.logger {}

/**
 * Controller to access feed definitions.
 */
@RestController
class FeedDefinitionController(val feedDefinitionService: FeedDefinitionService) {

    @GetMapping("/api/feed/definition/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getById(@PathVariable id: String): FeedDefinition {
        logger.debug { "Feed definition by ID request accepted." }
        return feedDefinitionService.getById(id)
    }

    @GetMapping("/api/feed/definition")
    @ResponseStatus(HttpStatus.OK)
    fun getAll(): Mono<List<FeedDefinition>>? {
        logger.debug { "Feed definition request accepted." }
        return feedDefinitionService.getAll()
    }

    @PostMapping("/api/feed/definition")
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody feedDefinition: FeedDefinition): Mono<FeedDefinition>? {
        logger.debug { "Feed definition create request accepted." }
        return feedDefinitionService.create(feedDefinition)
    }

    @PutMapping("/api/feed/definition/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun update(): Mono<FeedDefinition>? {
        logger.debug { "Feed definition update request accepted." }
        return feedDefinitionService.update(null, null)
    }

    @DeleteMapping("/api/feed/definition/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun delete(): Mono<Void>? {
        logger.debug { "Feed definition delete request accepted." }
        return feedDefinitionService.delete(null)
    }

}
