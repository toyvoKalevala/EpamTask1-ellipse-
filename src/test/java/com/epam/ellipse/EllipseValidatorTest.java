package com.epam.ellipse;

import org.junit.Assert;
import org.junit.Test;

public class EllipseValidatorTest {

    @Test
    public void testIsEllipseShouldReturnTrueIfFigureIsEllipse() {
        //given
        EllipseValidator circleValidator = new EllipseValidator();
        String testLine = "4.0 4.0 7.0 2.5";
        //when
        boolean isFigureEllipse = circleValidator.isEllipse(testLine);
        //then
        Assert.assertTrue(isFigureEllipse);
    }

    @Test
    public void testIsEllipseShouldReturnFalseIfFigureIsNotEllipse() {
        //given
        EllipseValidator circleValidator = new EllipseValidator();
        String testLine = "4.0 4.0 6.0 2.0";
        //when
        boolean isFigureEllipse = circleValidator.isEllipse(testLine);
        //then
        Assert.assertFalse(isFigureEllipse);
    }
}


