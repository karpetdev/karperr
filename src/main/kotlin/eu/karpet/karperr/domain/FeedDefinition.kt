package eu.karpet.karperr.domain

import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table
import java.time.LocalDateTime

@Table("feed_definition")
data class FeedDefinition(@PrimaryKey val id: String, val name: String, val url: String, var created: LocalDateTime)
