package com.bbdd2.tpfinal.model;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author nahuel.barrena on 7/4/21
 */
@Document(indexName = "room")
public class Room extends IdentifiedEntity {

	@Field
	private String name;

	@Field(type = FieldType.Nested)
	private Hotel hotel;

	public Room(String name, Hotel hotel) {
		this.name = name;
		this.hotel = hotel;
	}

	public Room(long id, String name, Hotel hotel) {
		super(id);
		this.name = name;
		this.hotel = hotel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
}
