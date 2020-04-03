package guru.spring.sfgpetclinic.maps;

import guru.spring.sfgpetclinic.models.Vet;
import guru.spring.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapServiec<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
