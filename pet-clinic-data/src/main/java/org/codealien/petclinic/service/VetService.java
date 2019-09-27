package org.codealien.petclinic.service;

import java.util.Set;

import org.codealien.petclinic.model.Vet;

public interface VetService {
	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();
}
