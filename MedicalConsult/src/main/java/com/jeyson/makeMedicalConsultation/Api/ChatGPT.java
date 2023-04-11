package com.jeyson.makeMedicalConsultation.Api;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jeyson.makeMedicalConsultation.Interfaces.Api.ChatGPTInterface;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;


public class ChatGPT implements ChatGPTInterface {
    private static final String API_KEY = "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";
    private static final String API_URL = "https://api.openai.com/v1/chat/completions";

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public ChatGPT() {
        restTemplate = new RestTemplate();
        objectMapper = new ObjectMapper();
    }

    @Override
    public String generateResponse(String inputText) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(API_KEY);
        String medicalConsult = "Actua como un médico y dame un diagnostico según los siguientes sintomas: "+inputText;

        String requestBody = String.format(
                "{ \"model\": \"gpt-3.5-turbo\", \"messages\": [{\"role\": \"user\", \"content\": \"%s\"}] }",
                medicalConsult
        );

        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);
        ResponseEntity<String> response = restTemplate.exchange(API_URL, HttpMethod.POST, entity, String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            try {
                JsonNode jsonResponse = objectMapper.readTree(response.getBody());
                String generatedResponse = jsonResponse.get("choices").get(0).get("message").get("content").asText();
                return generatedResponse.trim();
            } catch (Exception e) {
                e.printStackTrace();
                return "Error: Failed to parse API response";
            }
        } else {
            return "Error: API call failed with status code " + response.getStatusCode();
        }
    }

}
