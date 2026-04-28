package se.iths.labgeminiintegration.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se.iths.labgeminiintegration.repository.AiChatPromptRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AiChatService {

    private final AiChatPromptRepository chatPromptRepository;
    private final GeminiService geminiService;

    public List<String> getAllResponses() {
        // Here you would implement the logic to retrieve all prompts from the repository
        // and get responses for each prompt using the GeminiService. This is a placeholder implementation.
        return List.of("Response 1 from AiChatPromptService.", "Response 2 from AiChatPromptService.");
    }

    public void processAndSavePrompt(String userPrompt) {
        // GeminiService
        // Map from dto to entity
        // Save to repository
    }
}
