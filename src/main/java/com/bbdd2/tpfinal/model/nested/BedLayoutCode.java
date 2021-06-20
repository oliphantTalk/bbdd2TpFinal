package com.bbdd2.tpfinal.model.nested;

import java.util.List;
import java.util.Random;

public enum BedLayoutCode {
    SNG, DBL, QEN, KNG;

    private static final List<BedLayoutCode> VALUES =
            List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static BedLayoutCode random()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
