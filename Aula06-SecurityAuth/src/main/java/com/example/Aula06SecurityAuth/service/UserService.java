package com.example.Aula06SecurityAuth.service;

import com.example.Aula06SecurityAuth.controller.UserRequestDTO;
import com.example.Aula06SecurityAuth.controller.UserResponseDTO;
import com.example.Aula06SecurityAuth.model.PetOwner;
import com.example.Aula06SecurityAuth.model.UserMapper;
import com.example.Aula06SecurityAuth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserResponseDTO criarUsuario(UserRequestDTO userRequestDTO){
        PetOwner petOwner = UserMapper.toEntity(userRequestDTO);
        return  UserMapper.toResponse(userRepository.save(petOwner));
    }

}
