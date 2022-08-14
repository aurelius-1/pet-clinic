package com.marius.petclinic.services;

import com.marius.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet savePet(Pet pet);

    Set<Pet> findAll();
}
