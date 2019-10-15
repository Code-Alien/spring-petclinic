package org.codealien.petclinic.service.map;

import java.util.Set;

import org.codealien.petclinic.model.Owner;
import org.codealien.petclinic.service.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	public Owner save(Owner entity) {
		return entity;

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

}
