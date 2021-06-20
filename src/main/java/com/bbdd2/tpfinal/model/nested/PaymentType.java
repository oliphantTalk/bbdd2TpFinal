package com.bbdd2.tpfinal.model.nested;

import java.util.List;
import java.util.Random;

/**
 * @author nahuel.barrena on 25/4/21
 */
public enum PaymentType {
	CREDIT_CARD, DEBIT_CARD, ACCOUNT;

	private static final List<PaymentType> VALUES =
			List.of(values());
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static PaymentType random()  {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
}
