package com.example.marvel_challenge.services;

import com.example.marvel_challenge.dto.MyPageable;
import java.util.List;
import com.example.marvel_challenge.persistence.integration.marvel.dto.ComicDto;

public interface ComicService {

    public List<ComicDto> findAll(MyPageable pageable, Long characterId);

    public ComicDto findById(long comicId);
}
