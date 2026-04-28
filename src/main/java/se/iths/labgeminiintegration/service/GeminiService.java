package se.iths.labgeminiintegration.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GeminiService {

    public String getPromptResponse(String userPrompt) {
        // Logic for gemini integration
        return "Ai response";
    }


}
