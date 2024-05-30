package com.example.marvel_challenge.persistence.integration.marvel.dto;

public record CharacterSpecificationDto(
        String name, int[] comics, int[] series) {
}