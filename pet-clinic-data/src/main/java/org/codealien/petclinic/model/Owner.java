package org.codealien.petclinic.model;

import java.util.Set;

public class Owner extends Person {

	private static final long serialVersionUID = -4594784992630246905L;

	private Set<Pet> pets;

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}

}
