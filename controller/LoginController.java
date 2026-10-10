package com.lexavoxa.controller;

import com.lexavoxa.service.LoginService;

public class LoginController {

    private final LoginService loginService = new LoginService();

    // HU02: Endpoint de inicio de sesión
    public String login(String email, String contrasena) {
        if (loginService.autenticar(email, contrasena)) {
            return "Login exitoso";
        }
        return "Credenciales inválidas";
    }
}