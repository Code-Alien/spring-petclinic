package org.codealien.petclinic.service.spring_data_jpa;

import java.util.HashSet;
import java.util.Set;

import org.codealien.petclinic.model.Vet;
import org.codealien.petclinic.repository.VetRepository;
import org.codealien.petclinic.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springDataJpa")
public class VetSDJpaService implements VetService {

	private final VetRepository vetRepository;

	public VetSDJpaService(VetRepository vetRepository) {
		super();
		this.vetRepository = vetRepository;
	}

	@Override
	public Vet save(Vet entity) {
		return vetRepository.save(entity);
	}

	@Override
	public Vet findById(Long id) {
		return vetRepository.findById(id).orElse(null);
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<>();
		vetRepository.findAll().forEach(vets::add);
		return vets;
	}

	@Override
	public void delete(Vet entity) {
		vetRepository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		vetRepository.deleteById(id);
	}

}
