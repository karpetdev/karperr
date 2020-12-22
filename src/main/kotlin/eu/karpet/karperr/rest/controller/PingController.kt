package eu.karpet.karperr.rest.controller

import mu.KotlinLogging
import org.springframework.web.bind.annotation.RestController

import reactor.core.publisher.Mono

import org.springframework.http.HttpStatus

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus

private val logger = KotlinLogging.logger {}

/**
 * Controller to ping app liveliness.
 */
@RestController
class PingController {

    @GetMapping("/api/ping")
    @ResponseStatus(HttpStatus.OK)
    fun getPing(): Mono<String>? {
        logger.debug { "Ping request accepted." }
        return Mono.just("up")
    }

}
