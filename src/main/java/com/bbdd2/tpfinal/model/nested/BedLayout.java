package com.bbdd2.tpfinal.model.nested;

import lombok.Builder;
import lombok.Data;

/**
 * @author nahuel.barrena on 25/4/21
 */
@Data
@Builder
public class BedLayout {

	private BedLayoutCode code;
	private int quantity;

}

