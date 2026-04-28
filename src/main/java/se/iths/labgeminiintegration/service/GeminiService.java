package se.iths.labgeminiintegration.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GeminiService {

    public String getPromptResponse(String userPrompt) {
        GenerateContentResponse response =
                null;
        try (Client client = new Client()){


            response = client.models.generateContent(
                    "gemini-3-flash-preview",
                    userPrompt,
                    null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return response.text();
    }


}
