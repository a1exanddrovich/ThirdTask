package com.epam.task.third.specifications;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleByPerimeterBetweenSpecificationTest {

    private final static double TEST_PERIMETER_FROM = 12.8;
    private final static double TEST_PERIMETER_TO = 45.6;
    private final TriangleByPerimeterBetweenSpecification specification = new TriangleByPerimeterBetweenSpecification(
            TEST_PERIMETER_FROM,
            TEST_PERIMETER_TO);

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
        Triangle triangle = new Triangle(new Point(1.9, 1.1),
                new Point(56.5, 6.7),
                new Point(19.7, 9.8),
                2);

        //when
        boolean result = specification.specified(triangle);

        //then
        Assert.assertFalse(result);

    }

}
