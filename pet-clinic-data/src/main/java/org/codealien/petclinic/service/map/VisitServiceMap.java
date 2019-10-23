package org.codealien.petclinic.service.map;

import java.util.Set;

import org.codealien.petclinic.model.Visit;
import org.codealien.petclinic.service.VisitService;
import org.springframework.stereotype.Service;

@Service
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {

	@Override
	public Visit save(Visit entity) {
		if (entity.getPet() == null || entity.getPet().getId() == null || entity.getPet().getOwner() == null
				|| entity.getPet().getOwner().getId() == null) {
			throw new RuntimeException("Invalid visit");
		}
		return super.save(entity);
	}

	public Visit findById(Long id) {
		return super.findById(id);
	}

	public Set<Visit> findAll() {
		return super.findAll();
	}

	public void delete(Visit entity) {
		super.delete(entity);
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
