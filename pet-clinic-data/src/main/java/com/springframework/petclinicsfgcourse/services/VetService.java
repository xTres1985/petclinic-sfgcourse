package com.springframework.petclinicsfgcourse.services;

import com.springframework.petclinicsfgcourse.model.Owner;
import com.springframework.petclinicsfgcourse.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLastName(String lastName);

    Vet findById(Long id);

    Vet save(Owner owner);

    Set<Vet> findAll();
}
