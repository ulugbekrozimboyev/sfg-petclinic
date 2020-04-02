package guru.spring.sfgpetclinic.services;

import guru.spring.sfgpetclinic.models.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
