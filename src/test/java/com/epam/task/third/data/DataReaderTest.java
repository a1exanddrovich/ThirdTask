package com.epam.task.third.data;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class DataReaderTest {

    private final String fileName = "src/main/resources/test.txt";
    private final List<String> expected = Arrays.asList("32jjnc",
                                                        "3.20 4.5 3.42 56.7 54.42 42.42 65.65",
                                                        "3.20 4.5 3.42 56.7 54.42 42.42",
                                                        "3.20 4.5");

    @Test
    public void ShouldReadDataFromFile() throws DataException, IOException {

        //given
        DataReader reader = new DataReader();

        //when
        List<String> actual = reader.readData(fileName);

        //then
        Assert.assertEquals(expected, actual);

    }

}
