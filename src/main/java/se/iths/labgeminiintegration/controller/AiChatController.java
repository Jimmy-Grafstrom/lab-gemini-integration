package se.iths.labgeminiintegration.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import se.iths.labgeminiintegration.model.AiChatPromptRequestDto;

@Controller
@RequestMapping("/")
public class AiChatController {

    @GetMapping
    public String getAllPrompts() {
        return "index";
    }

    @PostMapping("/submit-prompt")
    public String submitPrompt(@Valid @ModelAttribute("promptDto") AiChatPromptRequestDto promptDto,
                               BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        // Send to aichatservice, that uses geminiservice
        // and then return the response to the view. This is a placeholder implementation.
        return "redirect:/";
    }
}
