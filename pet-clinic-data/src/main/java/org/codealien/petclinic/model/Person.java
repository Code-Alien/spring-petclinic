package org.codealien.petclinic.model;

public class Person extends BaseEntity {

	private static final long serialVersionUID = -762958418473400945L;

	private String name;
	private String surname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
