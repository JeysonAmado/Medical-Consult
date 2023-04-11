package com.jeyson.makeMedicalConsultation.Services;


import com.jeyson.makeMedicalConsultation.Api.ChatGPT;
import com.jeyson.makeMedicalConsultation.Interfaces.Services.ChatGPTServiceInterface;
import org.springframework.stereotype.Service;


@Service
public class ChatGPTService implements ChatGPTServiceInterface {
    private final ChatGPT chatGPT = new ChatGPT();


    @Override
    public String getGeneratedResponse(String input) {
        return chatGPT.generateResponse(input);
    }
}

