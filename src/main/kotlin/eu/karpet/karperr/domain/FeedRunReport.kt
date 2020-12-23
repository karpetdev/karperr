package eu.karpet.karperr.domain

import org.springframework.data.cassandra.core.mapping.Table
import java.util.Date

@Table("feed_run_report")
data class FeedRunReport(val feedName: String, val runDate: Date)
