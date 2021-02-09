package com.epam.task.third.calculator;

import com.epam.task.third.entities.Point;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TriangleSideLengthCalculator {

    private final static Logger LOGGER = LogManager.getLogger(TriangleSideLengthCalculator.class);

    public double calculateSideLength(Point pointA, Point pointB) {
        LOGGER.info("Calculating the length between points " + pointA.toString() + " and " + pointB.toString() + " has started");
        double length = Math.hypot(Math.abs(pointA.getX() - pointB.getX()),
                                   Math.abs(pointA.getY() - pointB.getY()));
        LOGGER.info("Computed length between " + pointA.toString() + " and " + pointB.toString() + " is " + length);
        return length;
    }

}