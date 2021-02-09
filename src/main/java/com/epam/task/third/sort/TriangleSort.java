package com.epam.task.third.sort;

import com.epam.task.third.comparators.TriangleComparator;
import com.epam.task.third.entities.Triangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class TriangleSort {

    private final static Logger LOGGER = LogManager.getLogger(TriangleSort.class);

    public void sort(List<Triangle> triangles, TriangleComparator comparator) {
        LOGGER.info("The sorting of the list of triangles has started...");
        triangles.sort(comparator);
    }

}
