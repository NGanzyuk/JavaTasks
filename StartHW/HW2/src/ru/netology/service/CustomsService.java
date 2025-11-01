package ru.netology.service;

import static java.lang.Math.round;

public class CustomsService {

    private static final int WEIGHT_TAX = 100;

    public static int calculateCustoms(int price, int weight) {
        return price / 100 + weight * WEIGHT_TAX;
    }
}
