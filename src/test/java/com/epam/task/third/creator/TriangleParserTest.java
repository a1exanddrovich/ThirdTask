package com.epam.task.third.creator;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Triangle;
import com.epam.task.third.idgenerator.IdGenerator;
import org.junit.Assert;
import org.junit.Test;

public class TriangleParserTest {

    private final TriangleParser triangleParser = new TriangleParser();
    private final static String STRING_TO_BE_PARSED_TO_TRIANGLE = "2.0 35.6 40.66 66.56 42.42 55.55";

    @Test
    public void parseTheStringToTriangle() {

        //given
        Triangle expected = new Triangle(new Point(2.0, 35.6),
                                         new Point(40.66, 66.56),
                                         new Point(42.42, 55.55), 1);

        //when
        Triangle actual = triangleParser.parse(STRING_TO_BE_PARSED_TO_TRIANGLE);

        //then
        Assert.assertEquals(expected, actual);

    }

}
