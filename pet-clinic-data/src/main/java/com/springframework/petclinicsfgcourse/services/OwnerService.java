package com.springframework.petclinicsfgcourse.services;


import com.springframework.petclinicsfgcourse.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);


}
