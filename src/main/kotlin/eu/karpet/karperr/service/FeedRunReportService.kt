package eu.karpet.karperr.service

import eu.karpet.karperr.domain.FeedRunReport
import eu.karpet.karperr.repository.FeedRunReportRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.util.stream.Collectors
import java.util.stream.StreamSupport

@Service
class FeedRunReportService(val feedRunReportRepository: FeedRunReportRepository) {

    fun getAll(): Mono<List<FeedRunReport>> {
        return Mono.just(
            StreamSupport
            .stream(feedRunReportRepository.findAll().spliterator(), false)
            .collect(Collectors.toList()))
    }
}
