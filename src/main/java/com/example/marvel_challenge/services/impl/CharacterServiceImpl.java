package com.example.marvel_challenge.services.impl;

import java.util.List;
import com.example.marvel_challenge.persistence.integration.marvel.dto.CharacterDto;
import com.example.marvel_challenge.services.CharacterService;

public class CharacterServiceImpl implements CharacterService {

    @Override
    public List<CharacterDto> findAll(String name, int[] comics, int[] series, long offset, long limit) {
        return null;
    }

    @Override
    public CharacterDto.CharacterInfoDto findInfoDto(long characterId) {
        return null;
    }
}
