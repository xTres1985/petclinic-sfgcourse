package com.springframework.petclinicsfgcourse.repositories;

import com.springframework.petclinicsfgcourse.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
