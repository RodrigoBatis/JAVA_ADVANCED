package com.example.Aula06SecurityAuth.controller;


import com.example.Aula06SecurityAuth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDTO> criarUsuario(@RequestBody UserRequestDTO userRequestDTO){
        return ResponseEntity.ok(userService.criarUsuario(userRequestDTO));
    }
}
