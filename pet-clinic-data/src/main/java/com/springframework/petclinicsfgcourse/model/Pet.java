package com.springframework.petclinicsfgcourse.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public com.springframework.petclinicsfgcourse.model.PetType getPetType() {
        return petType;
    }

    public void setPetType(com.springframework.petclinicsfgcourse.model.PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
