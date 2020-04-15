package guru.spring.sfgpetclinic.repositories;

import guru.spring.sfgpetclinic.models.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Long> {
}
