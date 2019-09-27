package org.codealien.petclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {    
	
	private static final long serialVersionUID = 8584931636899973715L;
	
	private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
