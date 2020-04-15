package guru.spring.sfgpetclinic.repositories;

import guru.spring.sfgpetclinic.models.PetType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepository extends JpaRepository<PetType, Long> {
}
