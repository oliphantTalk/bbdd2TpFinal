package com.bbdd2.tpfinal.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import com.bbdd2.tpfinal.model.nested.MealPlan;
import com.bbdd2.tpfinal.model.nested.PaymentType;

/**
 * @author nahuel.barrena on 17/4/21
 */
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

	public RatePlan(){}

	public RatePlan(String name, MealPlan mealPlan, BigDecimal base, BigDecimal tax, BigDecimal total,
			PaymentType paymentType, LocalDate creationDate) {
		this.name = name;
		this.mealPlan = mealPlan;
		this.base = base;
		this.tax = tax;
		this.total = total;
		this.paymentType = paymentType;
		this.creationDate = creationDate;
	}

	public RatePlan(long id, String name, MealPlan mealPlan, BigDecimal base, BigDecimal tax, BigDecimal total,
			PaymentType paymentType, LocalDate creationDate) {
		super(id);
		this.name = name;
		this.mealPlan = mealPlan;
		this.base = base;
		this.tax = tax;
		this.total = total;
		this.paymentType = paymentType;
		this.creationDate = creationDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MealPlan getMealPlan() {
		return mealPlan;
	}

	public void setMealPlan(MealPlan mealPlan) {
		this.mealPlan = mealPlan;
	}

	public BigDecimal getBase() {
		return base;
	}

	public void setBase(BigDecimal base) {
		this.base = base;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
}
