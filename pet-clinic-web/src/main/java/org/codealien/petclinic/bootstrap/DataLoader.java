package org.codealien.petclinic.bootstrap;

import org.codealien.petclinic.model.Owner;
import org.codealien.petclinic.model.Vet;
import org.codealien.petclinic.service.OwnerService;
import org.codealien.petclinic.service.VetService;
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
		owner1.setName("Danylo");
		owner1.setSurname("Hreshchuk");
		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setName("Vlodko");
		owner2.setSurname("Polskii");
		ownerService.save(owner2);

		System.out.println("Loaded owners....");

		Vet vet1 = new Vet();
		vet1.setName("Marmok");
		vet1.setSurname("Youtuber");
		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setName("Josef");
		vet2.setSurname("Jackson");
		vetService.save(vet2);

		System.out.println("Loaded Vets....");
	}

}
