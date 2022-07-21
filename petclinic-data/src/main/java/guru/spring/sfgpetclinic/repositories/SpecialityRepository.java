package guru.spring.sfgpetclinic.repositories;

import guru.spring.sfgpetclinic.models.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; // Noncompliant

@Repository
public interface SpecialityRepository extends JpaRepository<Speciality, Long> {
}
