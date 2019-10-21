package org.codealien.petclinic.model;

public class Speciality extends BaseEntity {

	private static final long serialVersionUID = 2766580639932362100L;

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
