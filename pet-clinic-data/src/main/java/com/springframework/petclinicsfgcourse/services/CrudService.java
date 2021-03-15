package com.springframework.petclinicsfgcourse.services;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void Delete(T object);

    void deteteById(ID id);
}
