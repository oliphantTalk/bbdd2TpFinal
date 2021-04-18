package com.bbdd2.tpfinal.model;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * @author nahuel.barrena on 17/4/21
 */
@Document(indexName = "offer")
public class Offer extends IdentifiedEntity {

	@Field
	private String name;

	public Offer(){}

	public Offer(String name) {
		this.name = name;
	}

	public Offer(long id, String name) {
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
