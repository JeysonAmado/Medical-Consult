package com.jeyson.makeMedicalConsultation.Interfaces.Services;

import com.jeyson.makeMedicalConsultation.Interfaces.Api.ChatGPTInterface;

import java.io.IOException;

public interface ChatGPTServiceInterface {
   String getGeneratedResponse(String input);
}

