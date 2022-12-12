package guru.springframework.petclinic;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class PetClinicDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetClinicDataApplication.class, args);
    }

    public static class Pet {

        private PetType petType;
        private Owner owner;
        private LocalDate birthDay;

        public PetType getPetType() {
            return petType;
        }

        public void setPetType(PetType petType) {
            this.petType = petType;
        }

        public Owner getOwner() {
            return owner;
        }

        public void setOwner(Owner owner) {
            this.owner = owner;
        }

        public LocalDate getBirthDay() {
            return birthDay;
        }

        public void setBirthDay(LocalDate birthDay) {
            this.birthDay = birthDay;
        }
    }

    public static class PetType {

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Vet extends Person {
    }
}
