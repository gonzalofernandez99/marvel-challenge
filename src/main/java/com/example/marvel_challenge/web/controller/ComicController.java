package com.example.marvel_challenge.web.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.marvel_challenge.dto.MyPageable;
import com.example.marvel_challenge.persistence.integration.marvel.dto.ComicDto;
import com.example.marvel_challenge.services.ComicService;

@RestController
@RequestMapping("/comics")
public class ComicController {

    private ComicService comicService;

    public ComicController(ComicService comicService) {
        this.comicService = comicService;
    }
    // Method to get all comics
    @GetMapping
    public ResponseEntity<List<ComicDto>> findAll(
            @RequestParam(required = false) Long characterId,
            @RequestParam(defaultValue = "0") long offset,
            @RequestParam(defaultValue = "10") long limit) {
        MyPageable pageable = new MyPageable(offset, limit);
        return ResponseEntity.ok(comicService.findAll(pageable, characterId));
    }

    @GetMapping("/{comicId}")
    public ResponseEntity<ComicDto> findById(@PathVariable long comicId) {
        return ResponseEntity.ok(comicService.findById(comicId));
    }

}
