package com.epam.task.third.logic;

import com.epam.task.third.entities.Triangle;
import com.epam.task.third.utilities.CheckForEquality;

public class TriangleLogic {

    private final static CheckForEquality CHECKER = new CheckForEquality();

    public double calculatePerimeter(Triangle triangle) {

        double firstSide = triangle.getSideAB();
        double secondSide = triangle.getSideBC();
        double thirdSide = triangle.getSideCA();

        double perimeter = firstSide + secondSide + thirdSide;

        return perimeter;

    }

    public double calculateArea(Triangle triangle) {

        double firstSide = triangle.getSideAB();
        double secondSide = triangle.getSideBC();
        double thirdSide = triangle.getSideCA();
        double halfOfPerimeter = (firstSide + secondSide + thirdSide) / 2;

        double area = Math.sqrt(halfOfPerimeter * (halfOfPerimeter - firstSide)
        * (halfOfPerimeter - secondSide) * (halfOfPerimeter - thirdSide));

        return area;

    }

    public boolean isRightTriangle(Triangle triangle) {

        double firstSide = triangle.getSideAB();
        double secondSide = triangle.getSideBC();
        double thirdSide = triangle.getSideCA();

        if(CHECKER.compare(firstSide, (Math.sqrt(Math.pow(secondSide, 2) + Math.pow(thirdSide, 2)))) ||
           CHECKER.compare(secondSide, (Math.sqrt(Math.pow(firstSide, 2) + Math.pow(thirdSide, 2)))) ||
           CHECKER.compare(thirdSide, (Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2))))) {
            return true;
        }

        return false;

    }

    public boolean isIsoscelesTriangle(Triangle triangle) {

        double firstSide = triangle.getSideAB();
        double secondSide = triangle.getSideBC();
        double thirdSide = triangle.getSideCA();

        if(CHECKER.compare(firstSide, secondSide) ||
           CHECKER.compare(firstSide, thirdSide) ||
           CHECKER.compare(secondSide, thirdSide)) {
            return true;
        }

        return false;

    }

    public boolean isRegularTriangle(Triangle triangle) {

        double firstSide = triangle.getSideAB();
        double secondSide = triangle.getSideBC();
        double thirdSide = triangle.getSideCA();

        if(CHECKER.compare(firstSide, secondSide) &&
           CHECKER.compare(firstSide, thirdSide) &&
           CHECKER.compare(secondSide, thirdSide)) {
            return true;
        }

        return false;

    }

    public boolean isAcuteAngledTriangle(Triangle triangle) {

        double firstSide = triangle.getSideAB();
        double secondSide = triangle.getSideBC();
        double thirdSide = triangle.getSideCA();

        if((firstSide > secondSide) && (firstSide > thirdSide)){
            if(Math.pow(firstSide, 2) < (Math.pow(secondSide, 2) + Math.pow(thirdSide, 2))) {
                return true;
            } else {
                return false;
            }
        }

        if((secondSide > thirdSide) && (secondSide > firstSide)){
            if(Math.pow(secondSide, 2) < (Math.pow(firstSide, 2) + Math.pow(thirdSide, 2))) {
                return true;
            } else {
                return false;
            }
        }

        if((thirdSide > firstSide) && (thirdSide > secondSide)){
            if(Math.pow(thirdSide, 2) < (Math.pow(firstSide, 2) + Math.pow(secondSide, 2))) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isObtuseAngledTriangle(Triangle triangle) {

        double firstSide = triangle.getSideAB();
        double secondSide = triangle.getSideBC();
        double thirdSide = triangle.getSideCA();

        if((firstSide > secondSide) && (firstSide > thirdSide)){
            if(Math.pow(firstSide, 2) > (Math.pow(secondSide, 2) + Math.pow(thirdSide, 2))) {
                return true;
            } else {
                return false;
            }
        }

        if((secondSide > thirdSide) && (secondSide > firstSide)){
            if(Math.pow(secondSide, 2) > (Math.pow(firstSide, 2) + Math.pow(thirdSide, 2))) {
                return true;
            } else {
                return false;
            }
        }

        if((thirdSide > firstSide) && (thirdSide > secondSide)){
            if(Math.pow(thirdSide, 2) > (Math.pow(firstSide, 2) + Math.pow(secondSide, 2))) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

}
