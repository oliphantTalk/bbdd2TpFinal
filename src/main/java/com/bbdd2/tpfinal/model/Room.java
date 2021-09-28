package com.bbdd2.tpfinal.model;

import java.time.LocalDate;
import java.util.List;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.bbdd2.tpfinal.model.nested.BedLayout;

/**
 * @author nahuel.barrena on 7/4/21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "room")
public class Room {

	@Id
	protected Long id;

	@Field
	private String name;

	@Field(type = FieldType.Nested)
	private Hotel hotel;

	@Field(type = FieldType.Nested)//, includeInParent = true)
	private RatePlan rate;

	@Field(type = FieldType.Nested)
	private List<BedLayout> bedLayout;

	@Field(type = FieldType.Date)
	private LocalDate creationDate;

	// Capacidad total. No hacemos distincion de edades por el momento, con el fin de simplificar.
	@Field(type = FieldType.Integer)
	private int capacity;

}
