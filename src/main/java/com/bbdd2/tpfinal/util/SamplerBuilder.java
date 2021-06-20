package com.bbdd2.tpfinal.util;


import com.bbdd2.tpfinal.model.Hotel;
import com.bbdd2.tpfinal.model.RatePlan;
import com.bbdd2.tpfinal.model.Room;
import com.bbdd2.tpfinal.model.nested.BedLayout;
import com.bbdd2.tpfinal.model.nested.BedLayoutCode;
import com.bbdd2.tpfinal.model.nested.MealPlan;
import com.bbdd2.tpfinal.model.nested.PaymentMethod;
import org.apache.commons.lang3.RandomStringUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SamplerBuilder {

    public static Hotel generateHotel() {
        return Hotel.builder()
                .active(randomBoolean())
                .name(randomString())
                .creationDate(randomLocalDate())
                .stars(randomInt(0, 5))
                .tags(List.of("tag1","tag2", "tag3"))
                .paymentMethod(PaymentMethod.random())
                .build();
    }

    public static Room generateRoom(Hotel hotel) {
        int capacity = randomInt(1, 10);
        return Room.builder()
                .bedLayout(List.of(generateBedLayout(capacity), generateBedLayout(capacity)))
                .creationDate(randomLocalDate())
                .capacity(capacity)
                .rate(generateRateplan())
                .name(randomString())
                .hotel(hotel)
                .build();
    }

    public static RatePlan generateRateplan(){
        BigDecimal randomBase = BigDecimal.valueOf(randomDouble(1000, 7000));
        BigDecimal tax = randomBase.multiply(BigDecimal.valueOf(randomDouble(0,1)));
        return RatePlan.builder()
                .mealPlan(MealPlan.random())
                .creationDate(randomLocalDate())
                .tax(tax)
                .base(randomBase)
                .total(randomBase.add(tax))
                .name(randomString())
                .build();
    }

    public static BedLayout generateBedLayout(int capacity){
        return BedLayout.builder()
                .code(BedLayoutCode.random())
                .quantity(capacity)
                .build();
    }

    public static boolean randomBoolean() {
        return new Random().nextBoolean();
    }

    public static String randomString() {
        int length = 14;
        return RandomStringUtils.random(length, true, false);
    }

    public static LocalDate randomLocalDate() {
        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2021, 1, 1).toEpochDay();
        long randomDay = minDay + new Random().nextInt(maxDay - minDay);
        return LocalDate.ofEpochDay(randomDay);
    }

    public static int randomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static double randomDouble(double min, double max) {
        return min + (max - min) * new Random().nextDouble();
    }

}
