package com.epam.task.third.logic;

import com.epam.task.third.entities.Point;
import com.epam.task.third.utilities.CheckForEquality;

public class PointLogic {

    private final static CheckForEquality CHECKER = new CheckForEquality();

    public boolean checkForXEquality(Point firstPoint, Point secondPoint, Point thirdPoint) {

        if(CHECKER.compare(firstPoint.getX(), secondPoint.getX()) &&
           CHECKER.compare(firstPoint.getX(), thirdPoint.getX()) &&
           CHECKER.compare(secondPoint.getX(), thirdPoint.getX())) {
            return true;
        }

        return false;

    }

    public boolean checkForYEquality(Point firstPoint, Point secondPoint, Point thirdPoint) {

        if(CHECKER.compare(firstPoint.getY(), secondPoint.getY()) &&
           CHECKER.compare(firstPoint.getY(), thirdPoint.getY()) &&
           CHECKER.compare(secondPoint.getY(), thirdPoint.getY())) {
            return true;
        }

        return false;

    }

    public boolean makeUpTriangle(Point firstPoint, Point secondPoint, Point thirdPoint) {

        boolean xEquality = checkForXEquality(firstPoint, secondPoint, thirdPoint);
        boolean yEquality = checkForYEquality(firstPoint, secondPoint, thirdPoint);

        if(xEquality || yEquality) {
            return false;
        }

        return true;

    }

}
