package org.codealien.petclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

	private static final long serialVersionUID = -762958418473400945L;

	@Column(name = "first_name")
	private String name;
	@Column(name = "last_name")
	private String surname;
}
