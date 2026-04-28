package se.iths.labgeminiintegration.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ai_chat_prompts")
public class AiChatPromptEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp;
    @Column(name = "prompt", nullable = false, columnDefinition = "TEXT")
    private String prompt;
    @Column(name = "response", nullable = false, columnDefinition = "TEXT")
    private String response;
}
