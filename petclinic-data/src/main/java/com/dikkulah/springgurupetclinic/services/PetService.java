package com.dikkulah.springgurupetclinic.services;

import com.dikkulah.springgurupetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
