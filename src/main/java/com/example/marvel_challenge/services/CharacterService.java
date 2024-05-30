package com.example.marvel_challenge.services;

import java.util.List;

import com.example.marvel_challenge.persistence.integration.marvel.dto.CharacterDto;

public interface CharacterService {
    public List<CharacterDto> findAll(String name, int[] comics, int[] series, long offset, long limit);

    public CharacterDto.CharacterInfoDto findInfoDto(long characterId);
}
