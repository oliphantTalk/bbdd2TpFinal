package com.bbdd2.tpfinal.model.nested;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author nahuel.barrena on 25/4/21
 */
public enum MealPlan {
	NONE, BREAKFAST, CONTINENTAL, HALF_PENSION, ALL_INCLUSIVE;

	private static final List<MealPlan> VALUES =
			List.of(values());
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static MealPlan random()  {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
}
