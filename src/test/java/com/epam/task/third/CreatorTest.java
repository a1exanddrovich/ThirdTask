package com.epam.task.third;

import com.epam.task.third.creator.Parser;
import com.epam.task.third.creator.Validator;
import com.epam.task.third.data.DataException;
import com.epam.task.third.data.DataReader;
import com.epam.task.third.entities.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class CreatorTest {

    private final static String FILENAME = "src/test.txt";
    private final static List<String> TEST_DATA = Arrays.asList("2.56 3.45 42.42");

    @Test
    public void testCreator() throws DataException {

        //given
        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readData(FILENAME)).thenReturn(TEST_DATA);

        Validator validator = Mockito.mock(Validator.class);
        when(validator.validate(anyString())).thenReturn(true);

        Parser parser = Mockito.mock(Parser.class);
        when(parser.parse(anyString())).thenReturn(new Triangle(2.56, 3.45, 42.42));

        Creator creator = new Creator(reader, validator, parser);


        //when
        Triangle actual = (Triangle) creator.create(FILENAME).get(0);

        //then
        Assert.assertEquals(new Triangle(2.56, 3.45, 42.42), actual);

    }

}
