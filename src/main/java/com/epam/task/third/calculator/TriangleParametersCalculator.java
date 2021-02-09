package com.epam.task.third.calculator;

import com.epam.task.third.entities.Triangle;

public class TriangleParametersCalculator {

    private final TriangleSideLengthCalculator sideLengthCalculator;

    public TriangleParametersCalculator(TriangleSideLengthCalculator sideCalculator) {
        this.sideLengthCalculator = sideCalculator;
    }

    public double calculatePerimeter(Triangle triangle) {
        double firstSide = sideLengthCalculator.calculateSideLength(triangle.getPointA(), triangle.getPointB());
        double secondSide = sideLengthCalculator.calculateSideLength(triangle.getPointB(), triangle.getPointC());
        double thirdSide = sideLengthCalculator.calculateSideLength(triangle.getPointC(), triangle.getPointA());
        double perimeter = firstSide + secondSide + thirdSide;

        return perimeter;

    }

    public double calculateArea(Triangle triangle) {
        double firstSide = sideLengthCalculator.calculateSideLength(triangle.getPointA(), triangle.getPointB());
        double secondSide = sideLengthCalculator.calculateSideLength(triangle.getPointB(), triangle.getPointC());
        double thirdSide = sideLengthCalculator.calculateSideLength(triangle.getPointC(), triangle.getPointA());
        double halfOfPerimeter = (firstSide + secondSide + thirdSide) / 2;
        double area = Math.sqrt(halfOfPerimeter * (halfOfPerimeter - firstSide)
                * (halfOfPerimeter - secondSide) * (halfOfPerimeter - thirdSide));

        return area;
    }

}
