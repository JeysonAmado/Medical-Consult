package com.jeyson.makeMedicalConsultation.Services;


import com.jeyson.makeMedicalConsultation.Api.ChatGPT;
import com.jeyson.makeMedicalConsultation.Interfaces.Services.ChatGPTServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class ChatGPTService implements ChatGPTServiceInterface {
    private final ChatGPT chatGPT;

    @Autowired
    public ChatGPTService(ChatGPT chatGPT) {
        this.chatGPT = chatGPT;
    }

    @Override
    public String getGeneratedResponse(String input) {
        return chatGPT.generateResponse(input);
    }
}

