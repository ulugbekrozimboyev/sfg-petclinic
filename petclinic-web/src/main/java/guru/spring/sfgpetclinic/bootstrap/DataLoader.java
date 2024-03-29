package guru.spring.sfgpetclinic.bootstrap;

import guru.spring.sfgpetclinic.models.Owner;
import guru.spring.sfgpetclinic.models.Vet;
import guru.spring.sfgpetclinic.services.OwnerService;
import guru.spring.sfgpetclinic.services.VetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Ali");
        owner1.setLastName("Aliev");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Vali");
        owner2.setLastName("Valiev");

        ownerService.save(owner2);

        log.info("Owner pul on map");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sherali");
        vet1.setLastName("Sheraliev");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jo'rali");
        vet2.setLastName("Jo'raliev");

        vetService.save(vet2);

        log.info("Vet pul on map");
    }
}
