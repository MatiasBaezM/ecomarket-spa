package com.ecomarket_spa.ecomarket.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomarket_spa.ecomarket.model.Auth;
import com.ecomarket_spa.ecomarket.services.AuthService;

@RestController
@RequestMapping("/auth")

public class AuthController {
    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(Auth Auth) {
        boolean authenticated = authService.login(Auth);
        if (authenticated) {
            //responseEntity = respuestas
            return ResponseEntity.ok("Login exitoso");
        } else {
            return ResponseEntity.status(401).body("Email o clave incorrecta");
        }
    }
}
