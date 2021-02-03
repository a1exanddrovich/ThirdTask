package com.epam.task.third.logic;

import com.epam.task.third.entities.Point;
import org.junit.Assert;
import org.junit.Test;

public class PointLogicTest {

    private final static PointLogic LOGIC = new PointLogic();
    private final static Point FIRST_POINT = new Point(2.55, 3);
    private final static Point SECOND_POINT = new Point(4, 3.22);
    private final static Point THIRD_POINT = new Point(2.55, 5);
    private final static Point FOURTH_POINT = new Point(6, 3.22);

    @Test
    public void testCheckForXEqualityShouldReturnTrue() {

        //given
        Point currentPoint = new Point(2.55, 6.42);

        //when
        boolean actual = LOGIC.checkForXEquality(currentPoint, FIRST_POINT, THIRD_POINT);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testCheckForXEqualityShouldReturnFalse() {

        //given
        Point currentPoint = new Point(4.7, 6.4);

        //when
        boolean actual = LOGIC.checkForXEquality(currentPoint, FIRST_POINT, THIRD_POINT);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void testCheckForYEqualityShouldReturnTrue() {

        //given
        Point currentPoint = new Point(20.22, 3.22);

        //when
        boolean actual = LOGIC.checkForYEquality(currentPoint, SECOND_POINT, FOURTH_POINT);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testCheckForYEqualityShouldReturnFalse() {

        //given
        Point currentPoint = new Point(20, 40);

        //when
        boolean actual = LOGIC.checkForYEquality(currentPoint, SECOND_POINT, FOURTH_POINT);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void testMakeUpTriangleShouldReturnTrue() {

        //given
        Point currentPoint = new Point(20, 40);

        //when
        boolean actual = LOGIC.makeUpTriangle(currentPoint, SECOND_POINT, FOURTH_POINT);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testMakeUpTriangleShouldReturnFalse() {

        //given
        Point currentPoint = new Point(2.55, 3);

        //when
        boolean actual = LOGIC.makeUpTriangle(currentPoint, FIRST_POINT, THIRD_POINT);

        //then
        Assert.assertFalse(actual);

    }

}
