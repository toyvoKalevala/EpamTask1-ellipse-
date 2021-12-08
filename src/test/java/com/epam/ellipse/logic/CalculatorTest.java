package com.epam.ellipse.logic;

import com.epam.ellipse.entity.Axis;
import com.epam.ellipse.entity.Ellipse;
import com.epam.ellipse.entity.Point;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private static final Point VALID_POINT_1 = new Point(3.0, 3.0);
    private static final Point VALID_POINT_2 = new Point(5.0, 1.0);
    private static final Point INVALID_POINT_1 = new Point(3.0, 4.0);
    private static final Point INVALID_POINT_2 = new Point(3.0, 4.0);

    private static final Calculator calculator = new Calculator();

    @Test
    public void testCalculateAreaShouldCalculateArea() {
        //given
        Ellipse ellipse = new Ellipse(VALID_POINT_1, VALID_POINT_2);
        //when
        double actualArea = calculator.calculateArea(ellipse);
        //then
        Assert.assertEquals(12.56, actualArea, 0.00);
    }

    @Test
    public void testCalculatePerimeterShouldCalculatePerimeter(){
        //given
        Ellipse ellipse = new Ellipse(VALID_POINT_1, VALID_POINT_2);
        //when
        double actualPerimeter = calculator.calculatePerimeter(ellipse);
        //then
        Assert.assertEquals(12.56, actualPerimeter, 0.00);
    }

    @Test
    public void testIsEllipseShouldReturnTrueIfTwoPointsIsValid(){
        //given
        //when
        boolean isEllipse = calculator.isEllipse(VALID_POINT_1, VALID_POINT_2);
        //then
        Assert.assertTrue(isEllipse);
    }

    @Test
    public void testIsEllipseShouldReturnFalseIfTwoPointsIsNotValid(){
        //given
        //when
        boolean isEllipse = calculator.isEllipse(INVALID_POINT_1, INVALID_POINT_2);
        //then
        Assert.assertFalse(isEllipse);
    }

    @Test
    public void testIsCrossingAxisShouldReturnTrueIfEllipseCrossingAxis(){
        //given
        Ellipse ellipse = new Ellipse(VALID_POINT_1, VALID_POINT_2);
        Double distance = 5.0;
        //when
        boolean isCrossing = calculator.isCrossingAxis(ellipse, distance, Axis.OX);
        //then
        Assert.assertTrue(isCrossing);
    }

    @Test
    public void testIsCircleShouldReturnTrueIfFigureIsCircle(){
        //given
        //when
        boolean isCircle = calculator.isCircle(INVALID_POINT_1, INVALID_POINT_2);
        //then
        Assert.assertTrue(isCircle);
    }
}
