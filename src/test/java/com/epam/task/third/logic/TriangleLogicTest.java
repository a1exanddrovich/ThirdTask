package com.epam.task.third.logic;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleLogicTest {

    private final static TriangleLogic LOGIC = new TriangleLogic();

    @Test
    public void testShouldReturnCalculatedPerimeter() {

        //given
        Triangle triangle = new Triangle(new Point(2.56, 3.45),
                new Point(42.42, 34.43),
                new Point(21.41, 89.67));

        //when
        double actual = LOGIC.calculatePerimeter(triangle);

        //then
        Assert.assertEquals(197.8405, actual, 0.0001);

    }

    @Test
    public void testShouldReturnCalculatedArea() {

        //given
        Triangle triangle = new Triangle(new Point(2.56, 3.45),
                new Point(42.42, 34.43),
                new Point(21.41, 89.67));

        //when
        double actual = LOGIC.calculateArea(triangle);

        //then
        Assert.assertEquals(1426.3781, actual, 0.0001);

    }

    @Test
    public void testShouldReturnTrueWhenRightTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(1, 1),
                new Point(1, 10),
                new Point(5, 1));

        //when
        boolean actual = LOGIC.isRightTriangle(triangle);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testShouldReturnFalseWhenNotRightTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(2.56, 3.45),
                new Point(42.42, 34.43),
                new Point(21.41, 89.67));

        //when
        boolean actual = LOGIC.isRightTriangle(triangle);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void testShouldReturnTrueWhenIsoscelesTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(2.56, 3.45),
                new Point(2.56, 3.45),
                new Point(21.41, 89.67));

        //when
        boolean actual = LOGIC.isIsoscelesTriangle(triangle);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testShouldReturnFalseWhenNotIsoscelesTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(2.56, 3.45),
                new Point(42.42, 34.43),
                new Point(21.41, 89.67));

        //when
        boolean actual = LOGIC.isIsoscelesTriangle(triangle);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void testShouldReturnTrueWhenRegularTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(2.56, 3.45),
                new Point(2.56, 3.45),
                new Point(2.56, 3.45));

        //when
        boolean actual = LOGIC.isRegularTriangle(triangle);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testShouldReturnFalseWhenRegularTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(2.56, 3.45),
                new Point(42.42, 34.43),
                new Point(21.41, 89.67));

        //when
        boolean actual = LOGIC.isRegularTriangle(triangle);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void testShouldReturnTrueWhenAcuteAngledTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(1, 1),
                new Point(3, 1),
                new Point(2, 10));

        //when
        boolean actual = LOGIC.isAcuteAngledTriangle(triangle);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testShouldReturnFalseWhenNotAcuteAngledTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(2.56, 3.45),
                new Point(42.42, 34.43),
                new Point(21.41, 89.67));

        //when
        boolean actual = LOGIC.isAcuteAngledTriangle(triangle);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void testShouldReturnTrueWhenObtuseAngledTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(2.56, 3.45),
                new Point(42.42, 34.43),
                new Point(21.41, 89.67));

        //when
        boolean actual = LOGIC.isObtuseAngledTriangle(triangle);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testShouldReturnFalseWhenObtuseAngledTriangleGiven() {

        //given
        Triangle triangle = new Triangle(new Point(1, 1),
                new Point(42.42, 1),
                new Point(21.41, 89.67));

        //when
        boolean actual = LOGIC.isObtuseAngledTriangle(triangle);

        //then
        Assert.assertFalse(actual);

    }

}
