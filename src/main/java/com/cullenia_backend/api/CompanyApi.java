package com.cullenia_backend.api;

import com.cullenia_backend.dto.AlphabeticalEntityWrapper;
import com.cullenia_backend.dto.ListedEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import tools.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@Component
public class CompanyApi  {

    private WebClient webClient;

    @Autowired
    private ObjectMapper mapper;

    private String URL = "https://www.cse.lk/api/alphabetical";

    public CompanyApi ( WebClient webClient){
        this.webClient=webClient;
    }


    public List<ListedEntity> getListedEntitiesAlphabetical() {
        MultipartBodyBuilder builder = new MultipartBodyBuilder();
        builder.part("alphabet", "");

        String response =  webClient.post()
                .uri(URL)
                .header("Origin", "https://www.cse.lk")
                .header("Referer", "https://www.cse.lk/listed-entities/listed-company-directory?page=ALPHABETICAL")
                .header("User-Agent", "Mozilla/5.0")
                .contentType(MediaType.MULTIPART_FORM_DATA)
                .body(BodyInserters.fromMultipartData(builder.build()))
                .retrieve()
                .bodyToMono(String.class)
                .block();

        AlphabeticalEntityWrapper wrapper =
                mapper.readValue(response, AlphabeticalEntityWrapper.class);

        return wrapper.getReqAlphabetical();
    }
}
