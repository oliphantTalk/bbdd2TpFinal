package com.bbdd2.tpfinal.model;

import org.springframework.data.annotation.Id;

/**
 * @author nahuel.barrena on 17/4/21
 */
public abstract class IdentifiedEntity {

	@Id
	protected Long id;

	public IdentifiedEntity(){}

	public IdentifiedEntity(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
