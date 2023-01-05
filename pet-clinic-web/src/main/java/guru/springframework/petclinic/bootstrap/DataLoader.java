package guru.springframework.petclinic.bootstrap;

import guru.springframework.petclinic.model.*;
import guru.springframework.petclinic.services.OwnerService;
import guru.springframework.petclinic.services.PetTypeService;
import guru.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Indiana");
        owner1.setLastName("Jones");
        owner1.setAdress("123, Joao 23");
        owner1.setCity("Sao joao");
        owner1.setTelephone("1985568745");

        Pet pet1 = new Pet();
        pet1.setPetType(savedCatPetType);
        pet1.setOwner(owner1);
        pet1.setBirthDay(LocalDate.now());
        pet1.setName("Mokito");

        owner1.getPets().add(pet1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Natasha");
        owner2.setLastName("Mota");
        owner2.setAdress("123, Joao 23");
        owner2.setCity("Sao joao");
        owner2.setTelephone("1985568745");


        Pet pet2 = new Pet();
        pet2.setPetType(savedDogPetType);
        pet2.setOwner(owner2);
        pet2.setBirthDay(LocalDate.now());
        pet2.setName("Sonienka");

        owner2.getPets().add(pet2);

        ownerService.save(owner1);
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Doutor");
        vet1.setLastName("Gatos Silva");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Doutor");
        vet2.setLastName("cachorros Santos");

        vetService.save(vet2);
        System.out.println("data saved");


    }
}
