package com.cullenia_backend.api;

import com.cullenia_backend.dto.AlphabeticalEntityWrapper;
import com.cullenia_backend.dto.ListedEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import tools.jackson.databind.ObjectMapper;

import java.util.List;

public class CompanyInfoSummaryApi {
    private WebClient webClient;

    @Autowired
    private ObjectMapper mapper;

    private String URL = "https://www.cse.lk/api/companyInfoSummery";

    public CompanyInfoSummaryApi ( WebClient webClient){
        this.webClient=webClient;
    }


    public String getCompanySummary(String symbol) {

        MultipartBodyBuilder builder = new MultipartBodyBuilder();
        builder.part("symbol", symbol);

        return webClient.post()
                .uri(URL)
                .header("Origin", "https://www.cse.lk")
                .header("Referer", "https://www.cse.lk/company-profile?symbol=" + symbol)
                .header("User-Agent", "Mozilla/5.0")
                .contentType(MediaType.MULTIPART_FORM_DATA)
                .body(BodyInserters.fromMultipartData(builder.build()))
                .retrieve()
                .onStatus(status -> status.isError(),
                        res -> res.bodyToMono(String.class)
                                .map(body -> new RuntimeException("API error: " + body)))
                .bodyToMono(String.class)
                .block();
    }
}
