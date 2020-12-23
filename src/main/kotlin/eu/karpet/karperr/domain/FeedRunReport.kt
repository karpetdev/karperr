package eu.karpet.karperr.domain

import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table
import java.util.Date

@Table("feed_run_report")
data class FeedRunReport(@PrimaryKey val id: String, val feedName: String, val runDate: Date)
