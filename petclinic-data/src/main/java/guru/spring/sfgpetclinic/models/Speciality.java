package guru.spring.sfgpetclinic.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "specialities")
public class Speciality {

    @Column(name = "description")
    private String description;
}
