package com.epam.task.third.calculator;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Triangle;
import com.epam.task.third.idgenerator.IdGenerator;
import org.junit.Assert;
import org.junit.Test;

public class TriangleParametersCalculatorTest {

    private final TriangleSideLengthCalculator sideLengthCalculator= new TriangleSideLengthCalculator();
    private final IdGenerator idGenerator = new IdGenerator();
    private final TriangleParametersCalculator parametersCalculator = new TriangleParametersCalculator(sideLengthCalculator);

    @Test
    public void testShouldReturnCalculatedPerimeter() {

        //given
        Triangle triangle = new Triangle(new Point(2.56, 3.45),
                new Point(42.42, 34.43),
                new Point(21.41, 89.67),
                idGenerator.getNextId());

        //when
        double actual = parametersCalculator.calculatePerimeter(triangle);

        //then
        Assert.assertEquals(197.8405, actual, 0.0001);

    }

    @Test
    public void testShouldReturnCalculatedArea() {

        //given
        Triangle triangle = new Triangle(new Point(2.56, 3.45),
                new Point(42.42, 34.43),
                new Point(21.41, 89.67),
                idGenerator.getNextId());

        //when
        double actual = parametersCalculator.calculateArea(triangle);

        //then
        Assert.assertEquals(1426.3781, actual, 0.0001);

    }

}
