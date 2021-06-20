package com.bbdd2.tpfinal.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.bbdd2.tpfinal.model.nested.BedLayout;

/**
 * @author nahuel.barrena on 7/4/21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
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

}
