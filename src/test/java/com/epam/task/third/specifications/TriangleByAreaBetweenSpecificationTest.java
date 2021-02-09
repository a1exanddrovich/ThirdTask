package com.epam.task.third.specifications;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleByAreaBetweenSpecificationTest {

    private final static double TEST_AREA_FROM = 19.9;
    private final static double TEST_AREA_TO = 45.6;
    private final TriangleByAreaBetweenSpecification specification = new TriangleByAreaBetweenSpecification(
                                                                                              TEST_AREA_FROM,
                                                                                              TEST_AREA_TO);

    @Test
    public void testShouldReturnTrue() {

        //given
        Triangle triangle = new Triangle(new Point(2.9, 4.1),
                                         new Point(3.5, 6.7),
                                         new Point(19.7, 9.8),
                                         2);

        //when
        boolean result = specification.specified(triangle);

        //then
        Assert.assertTrue(result);

    }

    @Test
    public void testShouldReturnFalse() {

        //given
        Triangle triangle = new Triangle(new Point(0.9, 0.1),
                new Point(3.5, 6.7),
                new Point(2.5, 99.8),
                2);

        //when
        boolean result = specification.specified(triangle);

        //then
        Assert.assertFalse(result);

    }

}
