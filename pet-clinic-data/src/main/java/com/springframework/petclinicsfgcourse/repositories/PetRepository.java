package com.springframework.petclinicsfgcourse.repositories;

import com.springframework.petclinicsfgcourse.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
