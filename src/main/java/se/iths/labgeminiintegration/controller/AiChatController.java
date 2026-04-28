package se.iths.labgeminiintegration.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import se.iths.labgeminiintegration.model.AiChatPromptRequestDto;
import se.iths.labgeminiintegration.service.AiChatService;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class AiChatController {

    private final AiChatService aiChatService;

    @GetMapping
    public String getAllPrompts(Model model) {
        model.addAttribute("prompts", aiChatService.getAllResponses());
        model.addAttribute("promptDto", new AiChatPromptRequestDto(""));
        return "index";
    }

    @PostMapping("/submit-prompt")
    public String submitPrompt(@Valid @ModelAttribute("promptDto") AiChatPromptRequestDto promptDto,
                               BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        aiChatService.processAndSavePrompt(promptDto.prompt());
        return "redirect:/";
    }
}
