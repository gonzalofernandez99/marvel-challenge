package com.example.marvel_challenge.services;

import java.util.List;

import com.example.marvel_challenge.dto.MyPageable;
import com.example.marvel_challenge.persistence.integration.marvel.dto.CharacterDto;

public interface CharacterService {
    public List<CharacterDto> findAll(MyPageable pageable, String name, int[] comics, int[] series);

    public CharacterDto.CharacterInfoDto findInfoDto(long characterId);
}
