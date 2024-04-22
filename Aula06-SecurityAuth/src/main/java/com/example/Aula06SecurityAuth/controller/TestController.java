package com.example.Aula06SecurityAuth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/public")
    public String endpointPublico(){
        return "Bem vindo ao endpoint não precisa autenticar";
    }

    @GetMapping("/private")
    public String endpointPrivado(){
        return "Bem vindo a uma area protegida. autenticão valida com sucesso";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String areaAdmin(){
        return "Area administrativa";
    }

}
