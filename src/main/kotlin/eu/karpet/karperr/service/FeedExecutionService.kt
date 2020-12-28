package eu.karpet.karperr.service

import eu.karpet.karperr.service.external.ExternalClient
import org.springframework.stereotype.Service

@Service
class FeedExecutionService(val externalClient: ExternalClient,
                           val feedDefinitionService: FeedDefinitionService) {

    fun execute(id: String): String? {
        val fd = feedDefinitionService.getById(id)
        return externalClient.get(fd.url).body
    }
}