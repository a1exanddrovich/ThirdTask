package com.epam.task.third.creator;

import org.junit.Assert;
import org.junit.Test;

public class ValidatorTest {

    private final static Validator VALIDATOR= new Validator();

    @Test
    public void validatorShouldReturnTrue() {

        //given
        String stringToBeValidate = "2.5 3.65 42.42 32.76 51.19 78.87";

        //when
        boolean actual = VALIDATOR.validate(stringToBeValidate);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void validatorShouldReturnFalseBecauseOfUsingInappropriateSymbols() {

        //given
        String stringToBeValidate = "2 F 3 4";

        //when
        boolean actual = VALIDATOR.validate(stringToBeValidate);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void validatorShouldReturnFalseBecauseOfLackOfInformation() {

        //given
        String stringToBeValidate = "20.65";

        //when
        boolean actual = VALIDATOR.validate(stringToBeValidate);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void validatorShouldReturnFalseBecauseOfExcessOfInformation() {

        //given
        String stringToBeValidate = "2 1 19.0 3 5";

        //when
        boolean actual = VALIDATOR.validate(stringToBeValidate);

        //then
        Assert.assertFalse(actual);

    }

}
