package org.codealien.petclinic.service;

import java.util.Set;

import org.codealien.petclinic.model.Owner;

public interface OwnerService {
	Owner findByLastName(String lastName);

	Owner findById(Long id);

	Owner save(Owner owner);

	Set<Owner> findAll();	
}
