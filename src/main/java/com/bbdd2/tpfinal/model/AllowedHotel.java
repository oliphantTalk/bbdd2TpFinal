package com.bbdd2.tpfinal.model;

import java.util.List;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author nahuel.barrena on 17/4/21
 */
@Document(indexName = "hotel-allowed")
public class AllowedHotel extends IdentifiableEntity {

	@Field(type = FieldType.Nested)
	private List<Long> whitelistHotels;
	@Field(type = FieldType.Nested)
	private List<Long> blacklistHotels;

	public AllowedHotel(){}

	public AllowedHotel(List<Long> whitelistHotels, List<Long> blacklistHotels) {
		this.whitelistHotels = whitelistHotels;
		this.blacklistHotels = blacklistHotels;
	}

	public AllowedHotel(long id, List<Long> whitelistHotels, List<Long> blacklistHotels) {
		super(id);
		this.whitelistHotels = whitelistHotels;
		this.blacklistHotels = blacklistHotels;
	}

	public List<Long> getWhitelistHotels() {
		return whitelistHotels;
	}

	public void setWhitelistHotels(final List<Long> whitelistHotels) {
		this.whitelistHotels = whitelistHotels;
	}

	public List<Long> getBlacklistHotels() {
		return blacklistHotels;
	}

	public void setBlacklistHotels(final List<Long> blacklistHotels) {
		this.blacklistHotels = blacklistHotels;
	}

}
