package com.springframework.petclinicsfgcourse.services;

import com.springframework.petclinicsfgcourse.model.Owner;
import com.springframework.petclinicsfgcourse.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
