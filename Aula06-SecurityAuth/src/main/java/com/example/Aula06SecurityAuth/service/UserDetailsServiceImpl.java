package com.example.Aula06SecurityAuth.service;

import com.example.Aula06SecurityAuth.model.PetOwner;
import com.example.Aula06SecurityAuth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        PetOwner petOwner = userRepository.findByUsername(username);
        if (petOwner == null){
            throw new UsernameNotFoundException("Usuario não Encontrado: " + username);
        }
        return User.withUsername(petOwner.getUsername())
                .password(petOwner.getPassword())
                .authorities("ROLE_USER")
                .accountExpired(false)
                .credentialsExpired(false)
                .disabled(false)
                .build();
    }

}
