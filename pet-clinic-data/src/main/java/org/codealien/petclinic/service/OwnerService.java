package org.codealien.petclinic.service;

import org.codealien.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);
}
