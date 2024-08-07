package com.example.marvel_challenge.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.marvel_challenge.dto.GetUserInteractionLogDto;

/**
 * UserInteractionLogService es una interfaz que define métodos para recuperar registros de interacciones de usuario.
 * Proporciona operaciones para buscar registros de interacciones de usuario en función de varios criterios, como nombre de usuario y paginación.
 */
public interface UserInteractionLogService {

    /**
     * Recupera una página de registros de interacciones de usuario.
     *
     * @param pageable Objeto Pageable que contiene información de paginación, como offset y límite.
     * @return Una página de registros de interacciones de usuario.
     */
    Page<GetUserInteractionLogDto> findAll(Pageable pageable);

    /**
     * Recupera una página de registros de interacciones de usuario para un usuario específico.
     *
     * @param pageable Objeto Pageable que contiene información de paginación, como offset y límite.
     * @param username Nombre de usuario para el que se buscan las interacciones.
     * @return Una página de registros de interacciones de usuario para el usuario especificado.
     */
    Page<GetUserInteractionLogDto> findByUsername(Pageable pageable, String username);
}
