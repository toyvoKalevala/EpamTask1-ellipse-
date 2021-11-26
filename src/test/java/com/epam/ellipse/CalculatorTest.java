package com.epam.ellipse;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testCalculateAreaShouldCalculateArea() {
        //given
        Calculator calculator = new Calculator();
        Ellipse ellipse = new Ellipse(2.0, 3.0);
        //when
        double actualArea = calculator.calculateArea(ellipse);
        //then
        Assert.assertEquals(18.84, actualArea, 0.0);
    }

    @Test
    public void testCalculatePerimeterShouldCalculatePerimeter(){
        //given
        Calculator calculator = new Calculator();
        Ellipse ellipse = new Ellipse(2.0, 3.0);
        //when
        double actualPerimeter = calculator.calculatePerimeter(ellipse);
        //then
        Assert.assertEquals(16.01, actualPerimeter, 0.001);
    }
}
