package com.bbdd2.tpfinal.model;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * @author nahuel.barrena on 17/4/21
 */
@Document(indexName = "hotel")
public class Hotel extends IdentifiedEntity {

	@Field
	private String name;

	public Hotel(){}

	public Hotel(String name) {
		this.name = name;
	}

	public Hotel(long id, String name) {
		super(id);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
