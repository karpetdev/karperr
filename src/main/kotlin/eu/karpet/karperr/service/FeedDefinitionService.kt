package eu.karpet.karperr.service

import eu.karpet.karperr.domain.FeedDefinition
import eu.karpet.karperr.repository.FeedDefinitionRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.util.stream.Collectors
import java.util.stream.StreamSupport

@Service
class FeedDefinitionService(val feedDefinitionRepository: FeedDefinitionRepository) {

    fun getAll(): Mono<List<FeedDefinition>> {
        return Mono.just(StreamSupport
            .stream(feedDefinitionRepository.findAll().spliterator(), false)
            .collect(Collectors.toList()))
    }
}
