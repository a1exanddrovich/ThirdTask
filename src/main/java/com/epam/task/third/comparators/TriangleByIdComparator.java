package com.epam.task.third.comparators;

import com.epam.task.third.entities.Triangle;

public class TriangleByIdComparator implements TriangleComparator {

    @Override
    public int compare(Triangle firstTriangle, Triangle secondTriangle) {
        Integer firstId = firstTriangle.getId();
        Integer secondId = secondTriangle.getId();
        return firstId.compareTo(secondId);
    }

}
