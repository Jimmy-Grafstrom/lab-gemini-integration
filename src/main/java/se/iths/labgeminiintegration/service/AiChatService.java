package se.iths.labgeminiintegration.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se.iths.labgeminiintegration.mapper.AiChatMapper;
import se.iths.labgeminiintegration.model.AiChatPromptEntity;
import se.iths.labgeminiintegration.model.AiChatPromptResponseDto;
import se.iths.labgeminiintegration.repository.AiChatPromptRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AiChatService {

    private final AiChatPromptRepository chatPromptRepository;
    private final GeminiService geminiService;
    private final AiChatMapper mapper;

    public List<AiChatPromptResponseDto> getAllResponses() {
        return chatPromptRepository.findAllByOrderByTimestampDesc()
                .stream()
                .map(mapper::toResponseDto)
                .toList();
    }

    public void processAndSavePrompt(String userPrompt) {
        String response = geminiService.getPromptResponse(userPrompt);
        AiChatPromptEntity entity = mapper.toEntity(userPrompt, response);
        chatPromptRepository.save(entity);
    }
}
