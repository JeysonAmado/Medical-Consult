package com.jeyson.makeMedicalConsultation.Controller;


import com.jeyson.makeMedicalConsultation.Api.ChatGPTRequest;
import com.jeyson.makeMedicalConsultation.Interfaces.Services.ChatGPTServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
public class ChatGPTController {
    @Autowired
    private ChatGPTServiceInterface chatGPTService;

    @PostMapping(value = "/api/chatgpt", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String generateResponse(@RequestBody ChatGPTRequest chatGPTRequest) {
        String responseText = chatGPTService.getGeneratedResponse(chatGPTRequest.getInputText());
        return "{\"responseText\": \"" + responseText + "\"}";
    }
}
