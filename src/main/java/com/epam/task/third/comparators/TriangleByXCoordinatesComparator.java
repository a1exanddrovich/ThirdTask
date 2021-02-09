package com.epam.task.third.comparators;

import com.epam.task.third.entities.Triangle;

public class TriangleByXCoordinatesComparator implements TriangleComparator{

    @Override
    public int compare(Triangle firstTriangle, Triangle secondTriangle) {
        Double firstX = firstTriangle.getPointA().getX();
        Double secondX = secondTriangle.getPointA().getX();
        return firstX.compareTo(secondX);
    }

}
