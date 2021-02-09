package com.epam.task.third.comparators;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleByIdComparatorTest {

    private final Triangle firstTriangle = new Triangle(new Point(2.9, 4.1),
                                                        new Point(3.5, 6.7),
                                                        new Point(19.7, 9.8),
                                                       65);

    private final TriangleByIdComparator comparator = new TriangleByIdComparator();

    @Test
    public void testShouldReturnOneBecauseIdOfFirstTriangleBiggerThanIdOfSecondOne() {

        //given
        Triangle secondTriangle = new Triangle(new Point(2.9, 4.1),
                new Point(3.5, 6.7),
                new Point(19.7, 9.8),
                2);

        //when
        int result = comparator.compare(firstTriangle, secondTriangle);

        //then
        Assert.assertEquals(1, result);

    }

    @Test
    public void testShouldReturnZeroBecauseIdOfFirstTriangleEqualsIdOfSecondOne() {

        //given
        Triangle secondTriangle = new Triangle(new Point(2.9, 4.1),
                new Point(3.5, 6.7),
                new Point(19.7, 9.8),
                65);

        //when
        int result = comparator.compare(firstTriangle, secondTriangle);

        //then
        Assert.assertEquals(0, result);

    }

    @Test
    public void testShouldReturnMinusOneBecauseIdOfFirstTriangleLessThanIdOfSecondOne() {

        //given
        Triangle secondTriangle = new Triangle(new Point(2.9, 4.1),
                new Point(3.5, 6.7),
                new Point(19.7, 9.8),
                78);

        //when
        int result = comparator.compare(firstTriangle, secondTriangle);

        //then
        Assert.assertEquals(-1, result);

    }

}
