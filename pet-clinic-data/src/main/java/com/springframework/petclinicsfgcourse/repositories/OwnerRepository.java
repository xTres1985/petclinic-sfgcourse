package com.springframework.petclinicsfgcourse.repositories;

import com.springframework.petclinicsfgcourse.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
