package com.epam.task.third;

import com.epam.task.third.creator.TriangleParser;
import com.epam.task.third.creator.DataValidator;
import com.epam.task.third.creator.TriangleValidator;
import com.epam.task.third.data.DataException;
import com.epam.task.third.data.DataReader;
import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class TriangleCreatorTest {

    private final static String FILENAME = "src/resources/test.txt";
    private final static List<String> TEST_DATA = Arrays.asList("2.56 3.45 42.42 34.43 21.41 89.67");

    @Test
    public void testCreator() throws DataException, IOException {

        //given
        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readData(FILENAME)).thenReturn(TEST_DATA);

        DataValidator validator = Mockito.mock(DataValidator.class);
        when(validator.validateLine(anyString())).thenReturn(true);

        TriangleParser parser = Mockito.mock(TriangleParser.class);
        when(parser.parse(anyString())).thenReturn(new Triangle(new Point(2.56, 3.45),
                                                                new Point(42.42, 34.43),
                                                                new Point(21.41, 89.67), 2));

        TriangleValidator triangleValidator = Mockito.mock(TriangleValidator.class);
        when(triangleValidator.validateTriangle(anyString())).thenReturn(true);

        TriangleCreator creator = new TriangleCreator(reader, validator, parser, triangleValidator);


        //when
        Triangle actual = creator.create(FILENAME).get(0);

        //then
        Assert.assertEquals(new Triangle(new Point(2.56, 3.45),
                new Point(42.42, 34.43),
                new Point(21.41, 89.67), 2), actual);

    }

}
