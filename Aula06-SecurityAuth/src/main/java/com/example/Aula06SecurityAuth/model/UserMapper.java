package com.example.Aula06SecurityAuth.model;

import com.example.Aula06SecurityAuth.controller.UserRequestDTO;
import com.example.Aula06SecurityAuth.controller.UserResponseDTO;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserMapper {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static PetOwner toEntity(UserRequestDTO dto){
        return new PetOwner(dto.getUserName(), encoder.encode(dto.getPassword()));
    }

    public static UserResponseDTO toResponse (PetOwner entity){
        return new UserResponseDTO(entity.getUsername());
    }

}
