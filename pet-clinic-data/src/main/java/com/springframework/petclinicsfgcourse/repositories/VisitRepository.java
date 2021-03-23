package com.springframework.petclinicsfgcourse.repositories;

import com.springframework.petclinicsfgcourse.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
