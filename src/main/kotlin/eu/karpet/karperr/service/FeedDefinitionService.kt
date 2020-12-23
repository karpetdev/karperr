package eu.karpet.karperr.service

import eu.karpet.karperr.domain.FeedDefinition
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.util.*

@Service
class FeedDefinitionService {

    fun getAll(): Mono<List<FeedDefinition>> {
        return Mono.just(Collections.emptyList())
    }
}