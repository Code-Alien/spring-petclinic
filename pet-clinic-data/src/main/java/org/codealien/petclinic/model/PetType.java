	package org.codealien.petclinic.model;

public class PetType extends BaseEntity{

	private static final long serialVersionUID = 5831790274280003172L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
