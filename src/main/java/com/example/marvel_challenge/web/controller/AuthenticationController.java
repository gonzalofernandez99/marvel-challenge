package com.example.marvel_challenge.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.marvel_challenge.dto.security.LoginRequest;
import com.example.marvel_challenge.dto.security.LoginResponse;
import com.example.marvel_challenge.services.AuthenticationService;

import jakarta.validation.Valid;

/**
 * Clase controladora que gestiona la autenticación y cierre de sesión de usuarios.
 * Esta clase proporciona endpoints para autenticar a los usuarios y cerrar su sesión.
 */
@RestController
@RequestMapping("/authentication")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    /**
     * Endpoint para autenticar a un usuario.
     *
     * @param loginRequest Objeto de solicitud de inicio de sesión que contiene las credenciales del usuario.
     * @return ResponseEntity que contiene la respuesta de autenticación en caso de éxito.
     */
    @PreAuthorize("jajaja")
    @PostMapping("/authenticate")
    public ResponseEntity<LoginResponse> authenticate(
            @RequestBody @Valid LoginRequest loginRequest
    ){
        return ResponseEntity.ok(authenticationService.authenticate(loginRequest));
    }

    /**
     * Endpoint para cerrar la sesión de un usuario autenticado.
     */
    @PreAuthorize("permitAll")
    @PostMapping("/logout")
    public void logout(){
        authenticationService.logout();
    }

}
