package com.epam.task.third.comparators;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleByXCoordinatesComparatorTest {

    private final Triangle firstTriangle = new Triangle(new Point(2.9, 4.1),
            new Point(3.5, 6.7),
            new Point(19.7, 9.8),
            1);

    private final TriangleByXCoordinatesComparator comparator = new TriangleByXCoordinatesComparator();

    @Test
    public void testShouldReturnOneBecauseXOfFirstTriangleBiggerThanIdOfSecondOne() {

        //given
        Triangle secondTriangle = new Triangle(new Point(1.9, 4.1),
                new Point(3.5, 6.7),
                new Point(19.7, 9.8),
                2);

        //when
        int result = comparator.compare(firstTriangle, secondTriangle);

        //then
        Assert.assertEquals(1, result);

    }

    @Test
    public void testShouldReturnZeroBecauseXOfFirstTriangleEqualsIdOfSecondOne() {

        //given
        Triangle secondTriangle = new Triangle(new Point(2.9, 4.1),
                new Point(3.5, 6.7),
                new Point(19.7, 9.8),
                3);

        //when
        int result = comparator.compare(firstTriangle, secondTriangle);

        //then
        Assert.assertEquals(0, result);

    }

    @Test
    public void testShouldReturnMinusOneBecauseXOfFirstTriangleLessThanIdOfSecondOne() {

        //given
        Triangle secondTriangle = new Triangle(new Point(45, 4.1),
                new Point(3.5, 6.7),
                new Point(19.7, 9.8),
                4);

        //when
        int result = comparator.compare(firstTriangle, secondTriangle);

        //then
        Assert.assertEquals(-1, result);

    }

}
