package se.iths.labgeminiintegration.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GeminiService {
public String getPromptResponse(String userPrompt) {
        try (Client client = new Client()) {
            GenerateContentResponse response = client.models.generateContent(
                    "gemini-3-flash-preview",
                    userPrompt,
                    null);
            return response.text();
        } catch (Exception e) {
            throw new RuntimeException("Kunde inte hämta svar från Gemini API", e);
        }
    }
}