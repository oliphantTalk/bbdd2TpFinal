package com.bbdd2.tpfinal.model;

import java.util.List;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;


/**
 * @author nahuel.barrena on 17/4/21
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Document(indexName = "hotel-allowed")
public class AllowedHotel {

	@Id
	protected Long id;

	@Field(type = FieldType.Nested)
	private List<Long> whitelistHotels;
	@Field(type = FieldType.Nested)
	private List<Long> blacklistHotels;

}
