package com.epam.task.third.logic;

import com.epam.task.third.entities.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleLogicTest {

    private final static TriangleLogic LOGIC = new TriangleLogic();

    @Test
    public void testShouldReturnCalculatedPerimeter() {

        //given
        Triangle triangle = new Triangle(2.45, 55.42, 42.42);

        //when
        double actual = LOGIC.calculatePerimeter(triangle);

        //then
        Assert.assertEquals(100.29, actual, 0.0001);

    }

    @Test
    public void testShouldReturnCalculatedArea() {

        //given
        Triangle triangle = new Triangle(3.42, 4.42, 5.42);

        //when
        double actual = LOGIC.calculateArea(triangle);

        //then
        Assert.assertEquals(7.5439, actual, 0.0001);

    }

    @Test
    public void testShouldReturnTrueWhenRightTriangleGiven() {

        //given
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        //when
        boolean actual = LOGIC.isRightTriangle(triangle);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testShouldReturnFalseWhenNotRightTriangleGiven() {

        //given
        Triangle triangle = new Triangle(3, 20, 5);

        //when
        boolean actual = LOGIC.isRightTriangle(triangle);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void testShouldReturnTrueWhenIsoscelesTriangleGiven() {

        //given
        Triangle triangle = new Triangle(4.53, 4.53, 5);

        //when
        boolean actual = LOGIC.isIsoscelesTriangle(triangle);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testShouldReturnFalseWhenNotIsoscelesTriangleGiven() {

        //given
        Triangle triangle = new Triangle(40, 4, 5);

        //when
        boolean actual = LOGIC.isIsoscelesTriangle(triangle);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void testShouldReturnTrueWhenRegularTriangleGiven() {

        //given
        Triangle triangle = new Triangle(40.42, 40.42, 40.42);

        //when
        boolean actual = LOGIC.isRegularTriangle(triangle);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testShouldReturnFalseWhenRegularTriangleGiven() {

        //given
        Triangle triangle = new Triangle(67, 87, 97);

        //when
        boolean actual = LOGIC.isRegularTriangle(triangle);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void testShouldReturnTrueWhenAcuteAngledTriangleGiven() {

        //given
        Triangle triangle = new Triangle(3.0, 3.0, 2.0);

        //when
        boolean actual = LOGIC.isAcuteAngledTriangle(triangle);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testShouldReturnFalseWhenNotAcuteAngledTriangleGiven() {

        //given
        Triangle triangle = new Triangle(50, 6, 3);

        //when
        boolean actual = LOGIC.isAcuteAngledTriangle(triangle);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void testShouldReturnTrueWhenObtuseAngledTriangleGiven() {

        //given
        Triangle triangle = new Triangle(6.0, 3.0, 4.0);

        //when
        boolean actual = LOGIC.isObtuseAngledTriangle(triangle);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testShouldReturnFalseWhenObtuseAngledTriangleGiven() {

        //given
        Triangle triangle = new Triangle(4.0, 3.0, 5.0);

        //when
        boolean actual = LOGIC.isObtuseAngledTriangle(triangle);

        //then
        Assert.assertFalse(actual);

    }

}
