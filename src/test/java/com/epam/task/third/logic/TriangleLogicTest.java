package com.epam.task.third.logic;

import com.epam.task.third.calculator.TriangleSideLengthCalculator;
import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Triangle;
import com.epam.task.third.idgenerator.IdGenerator;
import org.junit.Assert;
import org.junit.Test;

public class TriangleLogicTest {

    private final TriangleSideLengthCalculator sideLengthCalculator= new TriangleSideLengthCalculator();
    private final TriangleLogic triangleLogic = new TriangleLogic(sideLengthCalculator);
    private final IdGenerator idGenerator = new IdGenerator();

    @Test
    public void testShouldReturnTrueWhenRightTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(1, 1),
                new Point(1, 10),
                new Point(5, 1),
                idGenerator.getNextId());

        //when
        boolean actual = triangleLogic.isRightTriangle(triangle);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testShouldReturnFalseWhenNotRightTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(2.56, 3.45),
                new Point(42.42, 34.43),
                new Point(21.41, 89.67),
                idGenerator.getNextId());

        //when
        boolean actual = triangleLogic.isRightTriangle(triangle);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void testShouldReturnTrueWhenIsoscelesTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(2.56, 3.45),
                new Point(2.56, 3.45),
                new Point(21.41, 89.67),
                idGenerator.getNextId());

        //when
        boolean actual = triangleLogic.isIsoscelesTriangle(triangle);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testShouldReturnFalseWhenNotIsoscelesTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(2.56, 3.45),
                new Point(42.42, 34.43),
                new Point(21.41, 89.67),
                idGenerator.getNextId());

        //when
        boolean actual = triangleLogic.isIsoscelesTriangle(triangle);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void testShouldReturnTrueWhenRegularTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(2.56, 3.45),
                new Point(2.56, 3.45),
                new Point(2.56, 3.45),
                idGenerator.getNextId());

        //when
        boolean actual = triangleLogic.isRegularTriangle(triangle);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testShouldReturnFalseWhenRegularTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(2.56, 3.45),
                new Point(42.42, 34.43),
                new Point(21.41, 89.67),
                idGenerator.getNextId());

        //when
        boolean actual = triangleLogic.isRegularTriangle(triangle);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void testShouldReturnTrueWhenAcuteAngledTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(1, 1),
                new Point(3, 1),
                new Point(2, 10),
                idGenerator.getNextId());

        //when
        boolean actual = triangleLogic.isAcuteAngledTriangle(triangle);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testShouldReturnFalseWhenNotAcuteAngledTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(2.56, 3.45),
                new Point(42.42, 34.43),
                new Point(21.41, 89.67),
                idGenerator.getNextId());

        //when
        boolean actual = triangleLogic.isAcuteAngledTriangle(triangle);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void testShouldReturnTrueWhenObtuseAngledTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(2.56, 3.45),
                new Point(42.42, 34.43),
                new Point(21.41, 89.67),
                idGenerator.getNextId());

        //when
        boolean actual = triangleLogic.isObtuseAngledTriangle(triangle);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testShouldReturnFalseWhenObtuseAngledTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(1, 1),
                new Point(42.42, 1),
                new Point(21.41, 89.67),
                idGenerator.getNextId());

        //when
        boolean actual = triangleLogic.isObtuseAngledTriangle(triangle);

        //then
        Assert.assertFalse(actual);

    }

}
