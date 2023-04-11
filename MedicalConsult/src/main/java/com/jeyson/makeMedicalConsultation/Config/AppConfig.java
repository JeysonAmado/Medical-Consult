package com.jeyson.makeMedicalConsultation.Config;

import io.github.flashvayne.chatgpt.dto.ChatRequest;
import io.github.flashvayne.chatgpt.dto.ChatResponse;
import io.github.flashvayne.chatgpt.service.ChatgptService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ChatgptService chatgptService() {
        return new ChatgptService() {
            @Override
            public String sendMessage(String s) {
                return null;
            }

            @Override
            public ChatResponse sendChatRequest(ChatRequest chatRequest) {
                return null;
            }
        };
    }
}

