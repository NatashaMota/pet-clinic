package guru.springframework.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Vet extends Person{

    private Set<Speciality> specialties = new HashSet<>();
}
