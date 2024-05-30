package com.example.marvel_challenge.persistence.integration.marvel.repository;

import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.marvel_challenge.dto.MyPageable;
import com.example.marvel_challenge.persistence.integration.marvel.dto.CharacterDto;
import com.example.marvel_challenge.persistence.integration.marvel.dto.CharacterSpecificationDto;

@Repository
public class CharacterRepository {
    public List<CharacterDto> findAll(MyPageable pageable, CharacterSpecificationDto characterSpecificationDto) {
        return null;
    }

    public CharacterDto.CharacterInfoDto findInfoDto(long characterId) {
        return null;
    }
}
