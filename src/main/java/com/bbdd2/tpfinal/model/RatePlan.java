package com.bbdd2.tpfinal.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import com.bbdd2.tpfinal.model.nested.MealPlan;
import com.bbdd2.tpfinal.model.nested.PaymentType;

/**
 * @author nahuel.barrena on 17/4/21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(indexName = "rate")
public class RatePlan {

	@Id
	protected Long id;

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
