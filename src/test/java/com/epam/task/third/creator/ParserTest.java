package com.epam.task.third.creator;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class ParserTest {

    private final static Parser PARSER = new Parser();
    private final static String STRING_TO_BE_PARSED_TO_TRIANGLE = "2.0 35.6 40.66 66.56 42.42 55.55";

    @Test
    public void parseTheStringToTriangle() {

        //given
        Triangle expected = new Triangle(new Point(2.0, 35.6),
                                         new Point(40.66, 66.56),
                                         new Point(42.42, 55.55));

        //when
        Triangle actual = PARSER.parse(STRING_TO_BE_PARSED_TO_TRIANGLE);

        //then
        Assert.assertEquals(expected, actual);

    }

}
