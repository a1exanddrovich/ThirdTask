package com.epam.task.third.comparators;

import com.epam.task.third.entities.Triangle;

import java.util.Comparator;

public interface TriangleComparator extends Comparator<Triangle> {

    @Override
    int compare(Triangle firstTriangle, Triangle secondTriangle);

}
