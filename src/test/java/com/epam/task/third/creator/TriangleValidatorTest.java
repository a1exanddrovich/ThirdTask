package com.epam.task.third.creator;

import org.junit.Assert;
import org.junit.Test;

public class TriangleValidatorTest {

    private final TriangleValidator triangleValidator = new TriangleValidator();

    @Test
    public void testShouldReturnTrue() {

        //given
        String line = "2.0 35.6 40.66 66.56 42.42 55.55";

        //when
        boolean result = triangleValidator.validateTriangle(line);

        //then
        Assert.assertTrue(result);

    }

    @Test
    public void testShouldReturnFalse() {

        //given
        String line = "2.0 1.0 5.0 1.0 3.0 1.0";

        //when
        boolean result = triangleValidator.validateTriangle(line);

        //then
        Assert.assertFalse(result);

    }

}
