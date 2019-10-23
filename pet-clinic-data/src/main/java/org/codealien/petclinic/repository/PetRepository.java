package org.codealien.petclinic.repository;

import org.codealien.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long>{

}
