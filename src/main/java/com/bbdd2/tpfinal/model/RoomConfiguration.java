package com.bbdd2.tpfinal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author nahuel.barrena on 7/4/21
 */
@Document(indexName = "room-config")
public class RoomConfiguration {


	@Id
	private long id;
	private String name;

	public RoomConfiguration() {
	}

	public RoomConfiguration(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
