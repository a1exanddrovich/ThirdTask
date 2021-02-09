package com.epam.task.third.creator;

import org.junit.Assert;
import org.junit.Test;

public class DataValidatorTest {

    private final DataValidator validator = new DataValidator();

    @Test
    public void validatorShouldReturnTrue() {

        //given
        String line = "2.5 3.65 42.42 32.76 51.19 78.87";

        //when
        boolean actual = validator.validateLine(line);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void validatorShouldReturnFalseBecauseOfUsingInappropriateSymbols() {

        //given
        String stringToBeValidate = "2 F 3 4";

        //when
        boolean actual = validator.validateLine(stringToBeValidate);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void validatorShouldReturnFalseBecauseOfLackOfInformation() {

        //given
        String stringToBeValidate = "20.65";

        //when
        boolean actual = validator.validateLine(stringToBeValidate);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void validatorShouldReturnFalseBecauseOfExcessOfInformation() {

        //given
        String stringToBeValidate = "2 1 19.0 3 5";

        //when
        boolean actual = validator.validateLine(stringToBeValidate);

        //then
        Assert.assertFalse(actual);

    }

}
