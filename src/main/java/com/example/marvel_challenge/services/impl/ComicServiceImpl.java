package com.example.marvel_challenge.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.marvel_challenge.dto.MyPageable;
import com.example.marvel_challenge.persistence.integration.marvel.dto.ComicDto;
import com.example.marvel_challenge.persistence.integration.marvel.repository.ComicRepository;
import com.example.marvel_challenge.services.ComicService;

/**
 * El servicio `ComicServiceImpl` proporciona métodos para interactuar con cómics de marvel.
 */
@Service
public class ComicServiceImpl implements ComicService {

    @Autowired
    private ComicRepository comicRepository;

    /**
     * Recupera una lista de cómics según los parámetros de paginación y el ID de un personaje.
     *
     * @param pageable     Parámetros de paginación, como el offset y el límite.
     * @param characterId  El ID del personaje del que se desean recuperar los cómics.
     * @return Una lista de cómics que coinciden con los criterios especificados.
     */
    @Override
    public List<ComicDto> findAll(MyPageable pageable, Long characterId) {
        return comicRepository.findAll(pageable, characterId);
    }

    /**
     * Recupera un cómic por su ID.
     *
     * @param comicId El ID del cómic que se desea recuperar.
     * @return El cómic correspondiente al ID proporcionado.
     */
    @Override
    public ComicDto findById(Long comicId) {
        return comicRepository.findById(comicId);
    }
}

