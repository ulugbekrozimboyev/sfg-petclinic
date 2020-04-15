package guru.spring.sfgpetclinic.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

    private PetType petType;
    private Owner owner;

    @Column(name = "birth_date")
    private LocalDate birthDate;

}
