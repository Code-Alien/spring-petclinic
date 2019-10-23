package org.codealien.petclinic.service.map;

import java.util.Set;

import org.codealien.petclinic.model.Owner;
import org.codealien.petclinic.model.Pet;
import org.codealien.petclinic.service.OwnerService;
import org.codealien.petclinic.service.PetService;
import org.codealien.petclinic.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
	private final PetTypeService petTypeService;
	private final PetService petService;

	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	public Owner save(Owner entity) {

		if (entity != null) {
			if (entity.getPets() != null) {
				entity.getPets().forEach(pet -> {
					if (pet.getPetType() != null) {
						if (pet.getPetType().getId() == null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					} else {
						throw new RuntimeException("Pet Type is Required");
					}

					if (pet.getId() == null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}

				});
			}
			return super.save(entity);

		} else {
			return null;
		}

	}

	public Owner findById(Long id) {
		return super.findById(id);

	}

	public Set<Owner> findAll() {
		return super.findAll();

	}

	public void delete(Owner entity) {
		super.delete(entity);
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}

}
