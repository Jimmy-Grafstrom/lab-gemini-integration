package se.iths.labgeminiintegration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.iths.labgeminiintegration.model.AiChatPromptEntity;

@Repository
public interface AiChatPromptRepository extends JpaRepository<AiChatPromptEntity, Long> {
}
