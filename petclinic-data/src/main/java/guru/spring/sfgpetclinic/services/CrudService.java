package guru.spring.sfgpetclinic.services;

import guru.spring.sfgpetclinic.models.Owner;

import java.util.Set;

public interface CrudService<T, K> {

    T findById(K id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(K id);
}
