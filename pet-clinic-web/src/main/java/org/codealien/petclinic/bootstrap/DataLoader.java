package org.codealien.petclinic.bootstrap;

import java.time.LocalDate;

import org.codealien.petclinic.model.Owner;
import org.codealien.petclinic.model.Pet;
import org.codealien.petclinic.model.PetType;
import org.codealien.petclinic.model.Speciality;
import org.codealien.petclinic.model.Vet;
import org.codealien.petclinic.model.Visit;
import org.codealien.petclinic.service.OwnerService;
import org.codealien.petclinic.service.PetTypeService;
import org.codealien.petclinic.service.SpecialityService;
import org.codealien.petclinic.service.VetService;
import org.codealien.petclinic.service.VisitService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialityService specialityService;
	private final VisitService visitService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
			SpecialityService specialityService, VisitService visitService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialityService = specialityService;
		this.visitService = visitService;
	}

	@Override
	public void run(String... args) throws Exception {
		if (petTypeService.findAll().isEmpty()) {
			loadData();
		}
	}

	private void loadData() {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);

		PetType cat = new PetType();
		dog.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);

		Owner owner1 = new Owner();
		owner1.setName("Danylo");
		owner1.setSurname("Hreshchuk");
		owner1.setAddress("Sadova");
		owner1.setCity("Lviv");
		owner1.setTelephone("9111");

		Pet danylosDog = new Pet();
		danylosDog.setBirthDate(LocalDate.of(2018, 10, 10));
		danylosDog.setOwner(owner1);
		danylosDog.setPetType(savedDogPetType);
		danylosDog.setName("Dunai");
		owner1.getPets().add(danylosDog);
		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setName("Vlodko");
		owner2.setSurname("Polskii");
		owner2.setAddress("Stryiska");
		owner2.setCity("Lviv");
		owner2.setTelephone("777");

		Pet vlodkosCat = new Pet();
		vlodkosCat.setBirthDate(LocalDate.of(2019, 01, 10));
		vlodkosCat.setOwner(owner2);
		vlodkosCat.setPetType(savedCatPetType);
		vlodkosCat.setName("Barsik");
		owner2.getPets().add(vlodkosCat);
		ownerService.save(owner2);

		System.out.println("Loaded owners....");

		Speciality radiology = new Speciality();
		radiology.setDescription("radiology");
		Speciality savedRadiology = specialityService.save(radiology);

		Speciality surgery = new Speciality();
		surgery.setDescription("surgery");
		Speciality savedSurgery = specialityService.save(surgery);

		Speciality dentistry = new Speciality();
		dentistry.setDescription("dentistry");
		Speciality savedDentistry = specialityService.save(dentistry);

		Vet vet1 = new Vet();
		vet1.setName("Marmok");
		vet1.setSurname("Youtuber");
		vet1.getSpecialities().add(savedRadiology);
		vet1.getSpecialities().add(savedSurgery);

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setName("Josef");
		vet2.setSurname("Jackson");
		vet2.getSpecialities().add(savedDentistry);
		vetService.save(vet2);

		System.out.println("Loaded Vets....");

		Visit visit = new Visit();
		visit.setDate(LocalDate.now());
		visit.setDescription("sneezy kitty");
		visit.setPet(vlodkosCat);
		visitService.save(visit);
		System.out.println("Loaded Visits....");


	}

}
