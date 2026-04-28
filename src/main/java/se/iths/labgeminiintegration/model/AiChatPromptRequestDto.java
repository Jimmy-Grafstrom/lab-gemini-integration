package se.iths.labgeminiintegration.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AiChatPromptRequestDto(
        @NotBlank(message = "Prompt cannot be blank")
        @Size(min = 1, max = 500, message = "Prompt must be between 1 and 500 characters")
        String prompt
) {
}
