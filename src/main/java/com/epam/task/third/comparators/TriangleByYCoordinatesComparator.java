package com.epam.task.third.comparators;

import com.epam.task.third.entities.Triangle;

public class TriangleByYCoordinatesComparator implements TriangleComparator {

    @Override
    public int compare(Triangle firstTriangle, Triangle secondTriangle) {
        Double firstY = firstTriangle.getPointA().getY();
        Double secondY = secondTriangle.getPointA().getY();
        return firstY.compareTo(secondY);
    }

}
