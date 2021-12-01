package com.epam.ellipse.utils;

import org.junit.Assert;
import org.junit.Test;

public class DataValidatorTest {

    private final static String VALID_LINE = "4.0 4.0 7.0 2.5";
    private final static String INVALID_LINE = "4.0 4.0 4.0 ";

    private final static DataValidator dataValidator = new DataValidator();

    @Test
    public void testIsDataValidShouldReturnTrueIfDataValid() {
        //given
        //when
        boolean isDataValid = dataValidator.isDataValid(VALID_LINE);
        //then
        Assert.assertTrue(isDataValid);
    }

    @Test
    public void testIsDataValidReturnFalseIfDataIsNotValid() {
        //given
        //when
        boolean isDataValid = dataValidator.isDataValid(INVALID_LINE);
        //then
        Assert.assertFalse(isDataValid);
    }
}

