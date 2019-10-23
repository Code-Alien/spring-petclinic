package org.codealien.petclinic.service.spring_data_jpa;

import java.util.HashSet;
import java.util.Set;

import org.codealien.petclinic.model.Speciality;
import org.codealien.petclinic.repository.SpecialityRepository;
import org.codealien.petclinic.service.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springDataJpa")
public class SpecialitySDJpaService implements SpecialityService {

	private SpecialityRepository specialityRepository;

	public SpecialitySDJpaService(SpecialityRepository specialityRepository) {
		this.specialityRepository = specialityRepository;
	}

	@Override
	public Speciality save(Speciality entity) {
		return specialityRepository.save(entity);
	}

	@Override
	public Speciality findById(Long id) {
		return specialityRepository.findById(id).orElse(null);
	}

	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> specialities = new HashSet<>();
		specialityRepository.findAll().forEach(specialities::add);
		return specialities;
	}

	@Override
	public void delete(Speciality entity) {
		specialityRepository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		specialityRepository.deleteById(id);

	}

}
