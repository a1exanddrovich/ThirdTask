package com.epam.task.third;

import com.epam.task.third.creator.Parser;
import com.epam.task.third.creator.Validator;
import com.epam.task.third.data.DataException;
import com.epam.task.third.data.DataReader;
import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Triangle;
import com.epam.task.third.logic.PointLogic;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class CreatorTest {

    private final static String FILENAME = "src/test.txt";
    private final static List<String> TEST_DATA = Arrays.asList("2.56 3.45 42.42 34.43 21.41 89.67");

    @Test
    public void testCreator() throws DataException {

        //given
        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readData(FILENAME)).thenReturn(TEST_DATA);

        Validator validator = Mockito.mock(Validator.class);
        when(validator.validate(anyString())).thenReturn(true);

        Parser parser = Mockito.mock(Parser.class);
        when(parser.parse(anyString())).thenReturn(new Triangle(new Point(2.56, 3.45),
                                                                new Point(42.42, 34.43),
                                                                new Point(21.41, 89.67)));

        PointLogic canExist = Mockito.mock(PointLogic.class);
        when(canExist.makeUpTriangle(new Point(2.56, 3.45),
                                     new Point(42.42, 34.43),
                                     new Point(21.41, 89.67))).thenReturn(true);

        Creator creator = new Creator(reader, validator, parser, canExist);


        //when
        Triangle actual = creator.create(FILENAME).get(0);

        //then
        Assert.assertEquals(new Triangle(new Point(2.56, 3.45),
                new Point(42.42, 34.43),
                new Point(21.41, 89.67)), actual);

    }

}
