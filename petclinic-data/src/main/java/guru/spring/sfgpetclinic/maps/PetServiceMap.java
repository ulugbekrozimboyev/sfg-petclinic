package guru.spring.sfgpetclinic.maps;

import guru.spring.sfgpetclinic.models.Pet;
import guru.spring.sfgpetclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapServiec<Pet, Long> implements PetService {

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
}
