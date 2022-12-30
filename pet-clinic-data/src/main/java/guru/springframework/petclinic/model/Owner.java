package guru.springframework.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Owner extends Person{
    private String adress;
    private String city;
    private String telephone;
    private Set<Pet> pets;

}
