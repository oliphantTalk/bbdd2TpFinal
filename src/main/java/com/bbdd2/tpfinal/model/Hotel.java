package com.bbdd2.tpfinal.model;

import java.time.LocalDate;
import java.util.List;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import com.bbdd2.tpfinal.model.nested.PaymentMethod;

/**
 * @author nahuel.barrena on 17/4/21
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Document(indexName = "hotel")
public class Hotel extends IdentifiableEntity {

	@Field
	private String name;

	@Field
	private int stars;

	@Field(type = FieldType.Date)
	private LocalDate creationDate;

	@Field(type = FieldType.Boolean)
	private boolean active;

	@Field(type = FieldType.Object)
	private PaymentMethod paymentMethod;

	@Field(type = FieldType.Nested)
	private List<String> tags;

}
