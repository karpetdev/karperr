package eu.karpet.karperr.service

import eu.karpet.karperr.service.external.ExternalClient
import org.springframework.stereotype.Service

@Service
class FeedIngestionService(val externalClient: ExternalClient) {

}