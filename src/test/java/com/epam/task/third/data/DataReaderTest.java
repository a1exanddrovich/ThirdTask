package com.epam.task.third.data;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class DataReaderTest {

    private final static String FILENAME = "src/main/resources/test.txt";
    private final static List<String> EXPECTED = Arrays.asList("2.87 3.6 40", "qwerty", "2z 3 567 98");

    @Test
    public void ShouldReadDataFromFile() throws DataException{

        //given
        DataReader reader = new DataReader();

        //when
        List<String> actual = reader.readData(FILENAME);

        //then
        Assert.assertEquals(EXPECTED, actual);

    }

}
