package org.codealien.petclinic.service.map;

import java.util.Set;

import org.codealien.petclinic.model.Speciality;
import org.codealien.petclinic.service.SpecialityService;
import org.springframework.stereotype.Service;;

@Service 
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {

	@Override
	public Speciality save(Speciality entity) {
		return super.save(entity);
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(Speciality entity) {
		super.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
