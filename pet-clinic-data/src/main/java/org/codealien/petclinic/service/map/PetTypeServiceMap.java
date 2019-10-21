package org.codealien.petclinic.service.map;

import java.util.Set;

import org.codealien.petclinic.model.Pet;
import org.codealien.petclinic.model.PetType;
import org.codealien.petclinic.service.PetService;
import org.codealien.petclinic.service.PetTypeService;

public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService{

	@Override
	public PetType save(PetType entity) {
		return super.save(entity);
	}

	public PetType findById(Long id) {
		return super.findById(id);

	}

	public Set<PetType> findAll() {
		return super.findAll();

	}

	public void delete(PetType entity) {
		super.delete(entity);
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
