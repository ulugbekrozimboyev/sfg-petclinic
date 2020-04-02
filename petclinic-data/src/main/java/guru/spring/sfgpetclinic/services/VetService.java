package guru.spring.sfgpetclinic.services;

import guru.spring.sfgpetclinic.models.Vet;

import java.util.Set;

public interface VetService {


    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
