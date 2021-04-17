package com.bbdd2.tpfinal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author nahuel.barrena on 7/4/21
 */
@Document(indexName = "room-config")
public class RoomConfiguration {


	@Id private long id;
	private long number;
	private long bedsAmount;
	private String type;
	@Field(type = FieldType.Nested)
	private TariffConfiguration tariff;

	public RoomConfiguration() {
	}

	public RoomConfiguration(long id, long number, long bedsAmount, String type, TariffConfiguration tariff) {
		this.id = id;
		this.number = number;
		this.bedsAmount = bedsAmount;
		this.type = type;
		this.tariff = tariff;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public long getBedsAmount() { return bedsAmount; }

	public void setBedsAmount(long bedsAmount) { this.bedsAmount = bedsAmount; }

	public String getType() { return type; }

	public void setType(String type) { this.type = type; }

	public TariffConfiguration getTariff() { return tariff; }

	public void setTariff(TariffConfiguration tariff) { this.tariff = tariff; }
}
