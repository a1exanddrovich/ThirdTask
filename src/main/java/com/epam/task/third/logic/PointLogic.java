package com.epam.task.third.logic;

import com.epam.task.third.entities.Point;
import com.epam.task.third.utilities.CheckForEquality;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PointLogic {

    private final static Logger LOGGER = LogManager.getLogger(PointLogic.class);

    private final static CheckForEquality CHECKER = new CheckForEquality();

    public boolean checkForXEquality(Point pointA, Point pointB, Point pointC) {

        if(CHECKER.compare(pointA.getX(), pointB.getX()) &&
           CHECKER.compare(pointB.getX(), pointC.getX()) &&
           CHECKER.compare(pointA.getX(), pointC.getX())) {
            return true;
        }

        return false;

    }

    public boolean checkForYEquality(Point pointA, Point pointB, Point pointC) {

        if(CHECKER.compare(pointA.getY(), pointB.getY()) &&
           CHECKER.compare(pointB.getY(), pointC.getY()) &&
           CHECKER.compare(pointA.getY(), pointC.getY())) {
            return true;
        }

        return false;

    }

    public boolean makeUpTriangle(Point pointA, Point pointB, Point pointC) {

        boolean xEquality = checkForXEquality(pointA, pointB, pointC);
        boolean yEquality = checkForYEquality(pointA, pointB, pointC);

        if(xEquality || yEquality) {
            LOGGER.warn("A triangle cannot be created using these coordinates: " + pointA.toString() + ", " +
                        pointB.toString() + " and " + pointC.toString());
            return false;
        }

        return true;

    }

}
