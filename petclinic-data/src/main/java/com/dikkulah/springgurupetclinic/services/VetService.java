package com.dikkulah.springgurupetclinic.services;

import com.dikkulah.springgurupetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
