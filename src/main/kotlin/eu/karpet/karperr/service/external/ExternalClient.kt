package eu.karpet.karperr.service.external

import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.*
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate


@Service
class ExternalClient(val restTemplate: RestTemplate) {

    fun get(url: String): ResponseEntity<String> {
        val headers = HttpHeaders()
        val httpEntity: HttpEntity<*> = HttpEntity<Any>(headers)
        val typeRef: ParameterizedTypeReference<String> =
            object : ParameterizedTypeReference<String>() {}
        return restTemplate.exchange(url, HttpMethod.GET, httpEntity, typeRef)
    }
}
