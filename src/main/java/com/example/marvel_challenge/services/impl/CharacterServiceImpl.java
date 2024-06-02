package com.example.marvel_challenge.services.impl;

import java.util.List;

import com.example.marvel_challenge.dto.MyPageable;
import com.example.marvel_challenge.persistence.integration.marvel.dto.CharacterDto;
import com.example.marvel_challenge.persistence.integration.marvel.dto.CharacterSpecificationDto;
import com.example.marvel_challenge.persistence.integration.marvel.repository.CharacterRepository;
import com.example.marvel_challenge.services.CharacterService;

public class CharacterServiceImpl implements CharacterService {

    private CharacterRepository characterRepository;

    public CharacterServiceImpl(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public List<CharacterDto> findAll(MyPageable pageable, CharacterSpecificationDto characterSpecificationDto) {
        return characterRepository.findAll(pageable, characterSpecificationDto);
    }

    @Override
    public CharacterDto.CharacterInfoDto findInfoDto(long characterId) {
        return characterRepository.findInfoById(characterId);
    }
}
