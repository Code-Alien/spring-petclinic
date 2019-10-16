package org.codealien.petclinic.service.map;

import java.util.Set;

import org.codealien.petclinic.model.Pet;
import org.codealien.petclinic.service.CrudService;
import org.codealien.petclinic.service.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Pet save(Pet entity) {
		return super.save(entity.getId(), entity);
	}

	public Pet findById(Long id) {
		return super.findById(id);

	}

	public Set<Pet> findAll() {
		return super.findAll();

	}

	public void delete(Pet entity) {
		super.delete(entity);
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
