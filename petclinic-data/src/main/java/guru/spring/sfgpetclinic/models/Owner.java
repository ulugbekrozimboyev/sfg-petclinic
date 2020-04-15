package guru.spring.sfgpetclinic.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "owners")
public class Owner extends Person {


}
