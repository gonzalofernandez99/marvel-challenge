package com.example.marvel_challenge.persistence.integration.marvel.repository;

import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.marvel_challenge.dto.MyPageable;
import com.example.marvel_challenge.persistence.integration.marvel.dto.ComicDto;

@Repository
public class ComicRepository {
    public List<ComicDto> findAll(MyPageable pageable, Long characterId) {
        return null;
    }

    public ComicDto findById(long comicId) {
        return null;
    }
}
