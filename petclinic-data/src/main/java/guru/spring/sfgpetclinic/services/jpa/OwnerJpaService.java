package guru.spring.sfgpetclinic.services.jpa;

import guru.spring.sfgpetclinic.models.Owner;
import guru.spring.sfgpetclinic.repositories.OwnerRepository;
import guru.spring.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerJpaService implements OwnerService {

    private OwnerRepository ownerRepository;

    public OwnerJpaService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName).orElse(null);
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public Owner update(Owner owner, Long id) {
        Owner oldOwner = ownerRepository.findById(id).get();
        if (oldOwner == null) {
            oldOwner = new Owner(id, owner.getAddress(), owner. getCity(), owner.getTelephone(), owner.getPets());
        } else {
            oldOwner.setId(id);
            oldOwner.setAddress(owner.getAddress());
            oldOwner.setCity(owner.getCity());
            oldOwner.setTelephone(owner.getTelephone());
            oldOwner.setPets(owner.getPets());
        }
        return ownerRepository.save(oldOwner);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
