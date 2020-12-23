package eu.karpet.karperr.domain

import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table
import java.util.Date

@Table("feed_definition")
data class FeedDefinition(@PrimaryKey val id: String, val name: String, val url: String, val created: Date)
