package guru.spring.sfgpetclinic.services;

import guru.spring.sfgpetclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
