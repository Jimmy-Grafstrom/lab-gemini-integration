package se.iths.labgeminiintegration.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import se.iths.labgeminiintegration.model.AiChatPromptEntity;
import se.iths.labgeminiintegration.model.AiChatPromptRequestDto;
import se.iths.labgeminiintegration.model.AiChatPromptResponseDto;

import java.time.LocalDateTime;

@Mapper(componentModel = "spring", imports = {LocalDateTime.class})
public interface AiChatMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "response", ignore = true)
    @Mapping(target = "timestamp", expression = "java(LocalDateTime.now())")
    AiChatPromptEntity toEntity(AiChatPromptRequestDto requestDto);

    AiChatPromptResponseDto toResponseDto(AiChatPromptEntity entity);
}
