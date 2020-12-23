package eu.karpet.karperr.repository

import eu.karpet.karperr.domain.FeedRunReport
import org.springframework.data.repository.CrudRepository

interface FeedRunReportRepository : CrudRepository<FeedRunReport, String> {
}