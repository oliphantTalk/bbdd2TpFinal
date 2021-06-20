package com.bbdd2.tpfinal.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author nahuel.barrena on 17/4/21
 */
@Data
@Builder
public abstract class IdentifiableEntity {

	@Id
	protected Long id;

}
