package guru.springframework.petclinic.bootstrap;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.services.OwnerService;
import guru.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Indiana");
        owner1.setLastName("Jones");

        Owner owner2 = new Owner();
        owner2.setFirstName("Natasha");
        owner2.setLastName("Mota");

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
