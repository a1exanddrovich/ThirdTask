package com.epam.task.third.logic;

import com.epam.task.third.calculator.TriangleSideLengthCalculator;
import com.epam.task.third.entities.Triangle;

public class TriangleLogic {

    private final TriangleSideLengthCalculator sideLengthCalculator;

    private boolean equal(double firstValue, double secondValue) {
        return Math.abs(firstValue - secondValue) < 0.0001;
    }

    public TriangleLogic(TriangleSideLengthCalculator sideLengthCalculator) {
        this.sideLengthCalculator = sideLengthCalculator;
    }

    public boolean isRightTriangle(Triangle triangle) {
        double firstSide = sideLengthCalculator.calculateSideLength(triangle.getPointA(), triangle.getPointB());
        double secondSide = sideLengthCalculator.calculateSideLength(triangle.getPointB(), triangle.getPointC());
        double thirdSide = sideLengthCalculator.calculateSideLength(triangle.getPointC(), triangle.getPointA());

        return equal(firstSide, (Math.sqrt(Math.pow(secondSide, 2) + Math.pow(thirdSide, 2)))) ||
                equal(secondSide, (Math.sqrt(Math.pow(firstSide, 2) + Math.pow(thirdSide, 2)))) ||
                equal(thirdSide, (Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2))));
    }

    public boolean isIsoscelesTriangle(Triangle triangle) {
        double firstSide = sideLengthCalculator.calculateSideLength(triangle.getPointA(), triangle.getPointB());
        double secondSide = sideLengthCalculator.calculateSideLength(triangle.getPointB(), triangle.getPointC());
        double thirdSide = sideLengthCalculator.calculateSideLength(triangle.getPointC(), triangle.getPointA());

        return equal(firstSide, secondSide) ||
                equal(firstSide, thirdSide) ||
                equal(secondSide, thirdSide);
    }

    public boolean isRegularTriangle(Triangle triangle) {
        double firstSide = sideLengthCalculator.calculateSideLength(triangle.getPointA(), triangle.getPointB());
        double secondSide = sideLengthCalculator.calculateSideLength(triangle.getPointB(), triangle.getPointC());
        double thirdSide = sideLengthCalculator.calculateSideLength(triangle.getPointC(), triangle.getPointA());

        return equal(firstSide, secondSide) &&
                equal(firstSide, thirdSide) &&
                equal(secondSide, thirdSide);
    }

    public boolean isAcuteAngledTriangle(Triangle triangle) {
        double firstSide = sideLengthCalculator.calculateSideLength(triangle.getPointA(), triangle.getPointB());
        double secondSide = sideLengthCalculator.calculateSideLength(triangle.getPointB(), triangle.getPointC());
        double thirdSide = sideLengthCalculator.calculateSideLength(triangle.getPointC(), triangle.getPointA());

        if((firstSide > secondSide) && (firstSide > thirdSide)){
            return Math.pow(firstSide, 2) < (Math.pow(secondSide, 2) + Math.pow(thirdSide, 2));
        }
        if((secondSide > thirdSide) && (secondSide > firstSide)){
            return Math.pow(secondSide, 2) < (Math.pow(firstSide, 2) + Math.pow(thirdSide, 2));
        }
        if((thirdSide > firstSide) && (thirdSide > secondSide)){
            return Math.pow(thirdSide, 2) < (Math.pow(firstSide, 2) + Math.pow(secondSide, 2));
        }
        return true;
    }

    public boolean isObtuseAngledTriangle(Triangle triangle) {

        double firstSide = sideLengthCalculator.calculateSideLength(triangle.getPointA(), triangle.getPointB());
        double secondSide = sideLengthCalculator.calculateSideLength(triangle.getPointB(), triangle.getPointC());
        double thirdSide = sideLengthCalculator.calculateSideLength(triangle.getPointC(), triangle.getPointA());

        if((firstSide > secondSide) && (firstSide > thirdSide)){
            return Math.pow(firstSide, 2) > (Math.pow(secondSide, 2) + Math.pow(thirdSide, 2));
        }

        if((secondSide > thirdSide) && (secondSide > firstSide)){
            return Math.pow(secondSide, 2) > (Math.pow(firstSide, 2) + Math.pow(thirdSide, 2));
        }

        if((thirdSide > firstSide) && (thirdSide > secondSide)){
            return Math.pow(thirdSide, 2) > (Math.pow(firstSide, 2) + Math.pow(secondSide, 2));
        }
        return true;
    }

}