package com.springframework.petclinicsfgcourse.repositories;

import com.springframework.petclinicsfgcourse.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
