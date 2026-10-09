package com.lexavoxa.service;

public class LoginService {

    // HU02: Inicio de sesión de usuarios
    public boolean autenticar(String email, String contrasena) {
        // Validación básica (pendiente: conexión con MongoDB)
        if (email == null || contrasena == null) {
            return false;
        }
        if (!email.contains("@")) {
            return false;
        }
        if (contrasena.length() < 8) {
            return false;
        }
        return true;
    }
}