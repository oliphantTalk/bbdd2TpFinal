package com.bbdd2.tpfinal.model.nested;

import java.util.List;
import java.util.Random;

/**
 * @author nahuel.barrena on 25/4/21
 */
public enum PaymentMethod {
	PAY_AT_DESTINATION, PAY_IN_ADVANCE;

	private static final List<PaymentMethod> VALUES =
			List.of(values());
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static PaymentMethod random()  {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
}
