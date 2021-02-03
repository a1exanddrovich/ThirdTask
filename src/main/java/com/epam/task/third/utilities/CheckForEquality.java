package com.epam.task.third.utilities;

public class CheckForEquality {

    private final static double EPSILON = 0.0001d;

    public boolean compare(double firstValue, double secondValue) {

        boolean result = Math.abs(firstValue - secondValue) < EPSILON ? true : false;

        return result;

    }

}
