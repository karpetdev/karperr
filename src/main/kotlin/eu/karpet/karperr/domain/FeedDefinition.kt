package eu.karpet.karperr.domain

import org.springframework.data.cassandra.core.mapping.Table
import java.util.Date

@Table("feed_definition")
data class FeedDefinition(val name: String, val url: String, val created: Date)
