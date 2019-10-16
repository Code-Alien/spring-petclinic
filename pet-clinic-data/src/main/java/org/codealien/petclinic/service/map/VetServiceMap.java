package org.codealien.petclinic.service.map;

import java.util.Set;

import org.codealien.petclinic.model.Vet;
import org.codealien.petclinic.service.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Vet save(Vet entity) {
		return super.save(entity.getId(), entity);
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
