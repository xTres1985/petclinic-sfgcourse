package com.springframework.petclinicsfgcourse.services;


import com.springframework.petclinicsfgcourse.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);


}
