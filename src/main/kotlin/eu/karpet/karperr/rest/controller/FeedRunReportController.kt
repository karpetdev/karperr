package eu.karpet.karperr.rest.controller

import eu.karpet.karperr.domain.FeedRunReport
import eu.karpet.karperr.service.FeedRunReportService
import mu.KotlinLogging
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

private val logger = KotlinLogging.logger {}

/**
 * Controller to access feed run reports.
 */
@RestController
class FeedRunReportController(val feedRunReportService: FeedRunReportService) {

    @GetMapping("/api/feed/run")
    @ResponseStatus(HttpStatus.OK)
    fun getAll(): Mono<List<FeedRunReport>>? {
        logger.debug { "Feed run report request accepted." }
        return feedRunReportService.getAll()
    }

}
