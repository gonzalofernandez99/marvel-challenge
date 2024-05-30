package com.example.marvel_challenge.services.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.marvel_challenge.dto.MyPageable;
import com.example.marvel_challenge.persistence.integration.marvel.dto.ComicDto;
import com.example.marvel_challenge.services.ComicService;

@Service
public class ComicServiceImpl implements ComicService {
    @Override
    public List<ComicDto> findAll(MyPageable pageable, Long characterId) {
        return null;
    }

    @Override
    public ComicDto findById(long comicId) {
        return null;
    }
}
