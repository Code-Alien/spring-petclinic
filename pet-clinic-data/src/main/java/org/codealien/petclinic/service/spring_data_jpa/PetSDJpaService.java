package org.codealien.petclinic.service.spring_data_jpa;

import java.util.HashSet;
import java.util.Set;

import org.codealien.petclinic.model.Pet;
import org.codealien.petclinic.repository.PetRepository;
import org.codealien.petclinic.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springDataJpa")
public class PetSDJpaService implements PetService {
	private final PetRepository petRepository;

	public PetSDJpaService(PetRepository petRepository) {
		this.petRepository = petRepository;
	}

	@Override
	public Pet save(Pet entity) {
		return petRepository.save(entity);
	}

	@Override
	public Pet findById(Long id) {
		return petRepository.findById(id).orElse(null);
	}

	@Override
	public Set<Pet> findAll() {
		Set<Pet> pets = new HashSet<>();
		petRepository.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public void delete(Pet entity) {
		petRepository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		petRepository.deleteById(id);
	}

}
