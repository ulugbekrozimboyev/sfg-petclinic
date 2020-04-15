package guru.spring.sfgpetclinic.repositories;

import guru.spring.sfgpetclinic.models.Vet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends JpaRepository<Vet, Long> {
}
