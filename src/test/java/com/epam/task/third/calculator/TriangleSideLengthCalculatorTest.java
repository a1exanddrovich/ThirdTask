package com.epam.task.third.calculator;

import com.epam.task.third.entities.Point;
import com.epam.task.third.idgenerator.IdGenerator;
import org.junit.Assert;
import org.junit.Test;

public class TriangleSideLengthCalculatorTest {

    private final TriangleSideLengthCalculator sideLengthCalculator= new TriangleSideLengthCalculator();
    private final IdGenerator idGenerator = new IdGenerator();

    @Test
    public void testShouldReturnCorrectLengthBetweenTwoPointsFirstVersion() {

        //given
        Point pointA = new Point(2, 0);
        Point pointB = new Point(5, 0);

        //when
        double result = sideLengthCalculator.calculateSideLength(pointA, pointB);

        //then
        Assert.assertEquals(3, result, 0.001);

    }

    @Test
    public void testShouldReturnCorrectLengthBetweenTwoPointsSecondVersion() {

        //given
        Point pointA = new Point(2.654, 10.76);
        Point pointB = new Point(4.63, 42.42);

        //when
        double result = sideLengthCalculator.calculateSideLength(pointA, pointB);

        //then
        Assert.assertEquals(31.722, result, 0.001);

    }

}
