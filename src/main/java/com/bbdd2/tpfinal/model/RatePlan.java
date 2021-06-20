package com.bbdd2.tpfinal.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import com.bbdd2.tpfinal.model.nested.MealPlan;
import com.bbdd2.tpfinal.model.nested.PaymentType;

/**
 * @author nahuel.barrena on 17/4/21
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Document(indexName = "rate")
public class RatePlan extends IdentifiableEntity {

	@Field
	private String name;

	@Field(type = FieldType.Object)
	private MealPlan mealPlan;

	@Field(type = FieldType.Double)
	private BigDecimal base;

	@Field(type = FieldType.Double)
	private BigDecimal tax;

	@Field(type = FieldType.Double)
	private BigDecimal total;

	@Field(type = FieldType.Object)
	private PaymentType paymentType;

	@Field(type = FieldType.Date)
	private LocalDate creationDate;


}
