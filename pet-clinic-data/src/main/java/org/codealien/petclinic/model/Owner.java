package org.codealien.petclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name = "owners")
public class Owner extends Person {

	@Builder
	public Owner(String name, String surname, String address, String city, String telephone, Set<Pet> pets) {
		super(name, surname);
		this.address = address;
		this.city = city;
		this.telephone = telephone;
		this.pets = pets;
	}

	private static final long serialVersionUID = -4594784992630246905L;
	@Column(name = "address")
	private String address;
	@Column(name = "city")
	private String city;
	@Column(name = "telephone")
	private String telephone;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	private Set<Pet> pets = new HashSet<>();

}
