package com.example.marvel_challenge.web.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.marvel_challenge.dto.MyPageable;
import com.example.marvel_challenge.persistence.integration.marvel.dto.CharacterDto;
import com.example.marvel_challenge.persistence.integration.marvel.dto.CharacterSpecificationDto;
import com.example.marvel_challenge.services.CharacterService;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    private CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public ResponseEntity<List<CharacterDto>> findAll(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) int[] comics,
            @RequestParam(required = false) int[] series,
            @RequestParam(defaultValue = "0") long offset,
            @RequestParam(defaultValue = "10") long limit) {
        MyPageable pageable = new MyPageable(offset, limit);
        CharacterSpecificationDto characterSpecification = new CharacterSpecificationDto(name, comics, series);
        return ResponseEntity.ok(characterService.findAll(pageable, characterSpecification));
    }

    @GetMapping("/{characterId}")
    public ResponseEntity<CharacterDto.CharacterInfoDto> findInfoById(@PathVariable long characterId) {
        return ResponseEntity.ok(characterService.findInfoDto(characterId));
    }

}
