package org.codealien.petclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name = "vets")
public class Vet extends Person {

	private static final long serialVersionUID = -7448591538854588834L;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "vet_specialities", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "specialityt_id"))

	private Set<Speciality> specialities = new HashSet<>();

	@Builder
	public Vet(String name, String surname, Set<Speciality> specialities) {
		super(name, surname);
		this.specialities = specialities;
	}

}
