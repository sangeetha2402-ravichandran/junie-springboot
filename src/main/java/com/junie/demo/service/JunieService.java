package com.junie.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class JunieService {

    @Value("${junie.api.key}")
    private String apiKey;

    @Value("${junie.api.url}")
    private String apiUrl;

    private final WebClient webClient = WebClient.builder().build();

    public String callJunie(String prompt) {
        try {
            String requestBody = String.format(
                "{\"model\":\"gpt-4o-mini\",\"messages\":[{\"role\":\"user\",\"content\":\"%s\"}]}", 
                prompt
            );
            return webClient.post()
                    .uri(apiUrl)
                    .header("Authorization", "Bearer " + apiKey)
                    .header("Content-Type", "application/json")
                    .bodyValue(
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();
        } catch (Exception e) {
            return "Error calling Junie API: " + e.getMessage();
        }
    }
}
