package com.example.marvel_challenge.persistence.integration.marvel.dto;

public record ComicDto(
        Long id,
        String title,
        String description,
        String modified,
        String resourceURI,
        ThumbnailDto thumbnail
) {
}
