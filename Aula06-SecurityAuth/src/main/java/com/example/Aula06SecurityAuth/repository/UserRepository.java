package com.example.Aula06SecurityAuth.repository;

import com.example.Aula06SecurityAuth.model.PetOwner;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<PetOwner, Long> {

    PetOwner findByUsername(final String username);

}
