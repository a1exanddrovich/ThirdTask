package com.epam.task.third.specifications;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Triangle;

public class TriangleByFirstQuarterSpecification implements TriangleSpecification {

    private boolean checkIfPointPlacedInFirstQuarter(Point point) {
        return point.getX() > 0 && point.getY() > 0;
    }

    @Override
    public boolean specified(Triangle triangle) {
        return checkIfPointPlacedInFirstQuarter(triangle.getPointA()) &&
               checkIfPointPlacedInFirstQuarter(triangle.getPointB()) &&
               checkIfPointPlacedInFirstQuarter(triangle.getPointC());
    }

}
