package guru.spring.sfgpetclinic.repositories;

import guru.spring.sfgpetclinic.models.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecialtyRepository extends JpaRepository<Speciality, Long> {
}
