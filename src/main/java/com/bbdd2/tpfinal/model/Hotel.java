package com.bbdd2.tpfinal.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import com.bbdd2.tpfinal.model.nested.PaymentMethod;

/**
 * @author nahuel.barrena on 17/4/21
 */
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

	public Hotel(){}

	public Hotel(String name, int stars, LocalDate creationDate, boolean active, PaymentMethod paymentMethod,
			List<String> tags) {
		this.name = name;
		this.stars = stars;
		this.creationDate = creationDate;
		this.active = active;
		this.paymentMethod = paymentMethod;
		this.tags = tags;
	}

	public Hotel(long id, String name, int stars, LocalDate creationDate, boolean active, PaymentMethod paymentMethod,
			List<String> tags) {
		super(id);
		this.name = name;
		this.stars = stars;
		this.creationDate = creationDate;
		this.active = active;
		this.paymentMethod = paymentMethod;
		this.tags = tags;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
}
