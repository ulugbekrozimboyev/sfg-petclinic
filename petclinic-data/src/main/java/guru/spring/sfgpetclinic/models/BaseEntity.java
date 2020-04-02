package guru.spring.sfgpetclinic.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseEntity implements Serializable {

    private Long id;
}
