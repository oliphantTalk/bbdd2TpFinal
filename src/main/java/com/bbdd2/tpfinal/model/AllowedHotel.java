package com.bbdd2.tpfinal.model;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author nahuel.barrena on 17/4/21
 */
@EqualsAndHashCode(callSuper = true)
@Builder
@Data
@Document(indexName = "hotel-allowed")
public class AllowedHotel extends IdentifiableEntity {

	@Field(type = FieldType.Nested)
	private List<Long> whitelistHotels;
	@Field(type = FieldType.Nested)
	private List<Long> blacklistHotels;

}
