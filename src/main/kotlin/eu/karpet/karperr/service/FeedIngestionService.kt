package eu.karpet.karperr.service

import eu.karpet.karperr.service.external.ExternalClient

class FeedIngestionService {

    val ExternalClient externalClient

    fun getContent(): String {
        return "index"
    }
}