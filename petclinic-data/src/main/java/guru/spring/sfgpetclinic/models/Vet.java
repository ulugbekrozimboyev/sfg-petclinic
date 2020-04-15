package guru.spring.sfgpetclinic.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "vets")
public class Vet extends Person {
}
