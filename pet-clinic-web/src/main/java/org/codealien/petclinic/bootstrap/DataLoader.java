package org.codealien.petclinic.bootstrap;

import org.codealien.petclinic.model.Owner;
import org.codealien.petclinic.model.PetType;
import org.codealien.petclinic.model.Vet;
import org.codealien.petclinic.service.OwnerService;
import org.codealien.petclinic.service.PetService;
import org.codealien.petclinic.service.PetTypeService;
import org.codealien.petclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
		dog.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);

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
