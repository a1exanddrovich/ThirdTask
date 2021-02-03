package com.epam.task.third.creator;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class ParserTest {

    private final static Parser PARSER = new Parser();
    private final static String STRING_TO_BE_PARSED_TO_POINT = "120.3 34.5";
    private final static String STRING_TO_BE_PARSED_TO_TRIANGLE = "2.0 35.6 40.66";

    @Test
    public void parseTheStringToPoint() {

        //given
        Point expected = new Point(120.3, 34.5);

        //when
        Point actual = (Point) PARSER.parse(STRING_TO_BE_PARSED_TO_POINT);

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void parseTheStringToTriangle() {

        //given
        Triangle expected = new Triangle(2.0, 35.6, 40.66);

        //when
        Triangle actual = (Triangle) PARSER.parse(STRING_TO_BE_PARSED_TO_TRIANGLE);

        //then
        Assert.assertEquals(expected, actual);

    }

}
