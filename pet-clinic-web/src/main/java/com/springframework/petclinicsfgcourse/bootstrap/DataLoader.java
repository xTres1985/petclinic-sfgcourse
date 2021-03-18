package com.springframework.petclinicsfgcourse.bootstrap;

import com.springframework.petclinicsfgcourse.model.Owner;
import com.springframework.petclinicsfgcourse.model.Vet;
import com.springframework.petclinicsfgcourse.services.OwnerService;
import com.springframework.petclinicsfgcourse.services.VetService;
import com.springframework.petclinicsfgcourse.services.map.OwnerServiceMap;
import com.springframework.petclinicsfgcourse.services.map.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
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
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Owners loaded....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Michael");
        vet1.setLastName("Weston");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Michael");
        vet2.setLastName("Weston");

        vetService.save(vet2);

        System.out.println("Vets loaded....");

    }
}
