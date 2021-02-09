package com.epam.task.third.specifications;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleByIdSpecificationTest {

    private final static int ID = 1;
    private final TriangleByIdSpecification specification = new TriangleByIdSpecification(ID);

    @Test
    public void testShouldReturnTrue() {

        //given
        Triangle triangle = new Triangle(new Point(2.9, 4.1),
                new Point(3.5, 6.7),
                new Point(19.7, 9.8),
                1);

        //when
        boolean result = specification.specified(triangle);

        //then
        Assert.assertTrue(result);

    }

    @Test
    public void testShouldReturnFalse() {

        //given
        Triangle triangle = new Triangle(new Point(2.9, 4.1),
                new Point(3.5, 6.7),
                new Point(19.7, 9.8),
                34);

        //when
        boolean result = specification.specified(triangle);

        //then
        Assert.assertFalse(result);

    }

}
