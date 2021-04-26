package com.bbdd2.tpfinal.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.bbdd2.tpfinal.model.nested.BedLayout;

/**
 * @author nahuel.barrena on 7/4/21
 */
@Document(indexName = "room")
public class Room extends IdentifiableEntity {

	@Field
	private String name;

	@Field(type = FieldType.Nested)
	private Hotel hotel;

	@Field(type = FieldType.Nested)
	private RatePlan rate;

	@Field(type = FieldType.Nested)
	private List<BedLayout> bedLayout;

	@Field(type = FieldType.Date)
	private LocalDate creationDate;

	// Capacidad total. No hacemos distincion de edades por el momento, con el fin de simplificar.
	@Field(type = FieldType.Integer)
	private int capacity;

	public Room(){}

	public Room(String name, Hotel hotel, RatePlan rate, List<BedLayout> bedLayout, LocalDate creationDate,
			int capacity) {
		this.name = name;
		this.hotel = hotel;
		this.rate = rate;
		this.bedLayout = bedLayout;
		this.creationDate = creationDate;
		this.capacity = capacity;
	}

	public Room(long id, String name, Hotel hotel, RatePlan rate, List<BedLayout> bedLayout, LocalDate creationDate,
			int capacity) {
		super(id);
		this.name = name;
		this.hotel = hotel;
		this.rate = rate;
		this.bedLayout = bedLayout;
		this.creationDate = creationDate;
		this.capacity = capacity;
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

	public RatePlan getRate() {
		return rate;
	}

	public void setRate(RatePlan rate) {
		this.rate = rate;
	}

	public List<BedLayout> getBedLayout() {
		return bedLayout;
	}

	public void setBedLayout(List<BedLayout> bedLayout) {
		this.bedLayout = bedLayout;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
