package eu.karpet.karperr.service

import eu.karpet.karperr.domain.FeedDefinition
import eu.karpet.karperr.repository.FeedDefinitionRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.time.LocalDateTime
import java.util.*
import java.util.stream.Collectors
import java.util.stream.StreamSupport

@Service
class FeedDefinitionService(val feedDefinitionRepository: FeedDefinitionRepository) {

    fun getById(id: String): FeedDefinition {
        return feedDefinitionRepository.findById(id).get()
    }

    fun getAll(): Mono<List<FeedDefinition>> {
        return Mono.just(StreamSupport
            .stream(feedDefinitionRepository.findAll().spliterator(), false)
            .collect(Collectors.toList()))
    }

    fun create(feedDefinition: FeedDefinition): Mono<FeedDefinition>? {
        feedDefinition.created = LocalDateTime.now()
        return Mono.just(feedDefinitionRepository.save(feedDefinition))
    }

    fun update(id: String?, feedDefinition: FeedDefinition?): Mono<FeedDefinition>? {
        TODO("Not yet implemented")
    }

    fun delete(id: String?): Mono<Void>? {
        TODO("Not yet implemented")
    }
}
