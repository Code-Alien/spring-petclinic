package org.codealien.petclinic.service.map;

import java.util.Set;

import org.codealien.petclinic.model.Speciality;
import org.codealien.petclinic.model.Vet;
import org.codealien.petclinic.service.SpecialityService;
import org.codealien.petclinic.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
	private final SpecialityService specialityService;

	public VetServiceMap(SpecialityService specialityService) {
		this.specialityService = specialityService;
	}

	@Override
	public Vet save(Vet entity) {
		if (!entity.getSpecialities().isEmpty()) {
			entity.getSpecialities().forEach(speciality -> {
				if (speciality.getId() == null) {
					Speciality savedSpeciality = specialityService.save(speciality);
					speciality.setId(savedSpeciality.getId());
				}
			});
		}
		return super.save(entity);
	}

	public Vet findById(Long id) {
		return super.findById(id);
	}

	public Set<Vet> findAll() {
		return super.findAll();
	}

	public void delete(Vet entity) {
		super.delete(entity);
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
