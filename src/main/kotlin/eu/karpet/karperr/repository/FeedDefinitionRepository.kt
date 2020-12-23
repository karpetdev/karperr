package eu.karpet.karperr.repository

import eu.karpet.karperr.domain.FeedDefinition
import org.springframework.data.repository.CrudRepository

interface FeedDefinitionRepository : CrudRepository<FeedDefinition, String> {
}