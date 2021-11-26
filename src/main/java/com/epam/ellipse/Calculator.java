package com.epam.ellipse;

public class Calculator {

    final double PINUMBER = 3.14;

    public double calculateArea(Ellipse ellipse) {

        return PINUMBER * ellipse.getShortSemiAxis() * ellipse.getLongSemiAxis();
    }

    public double calculatePerimeter(Ellipse ellipse) {

        double ellipseLongSemiAxis = ellipse.getLongSemiAxis();
        double ellipseShortSemiAxis = ellipse.getShortSemiAxis();
        double sqrtExpression = Math.sqrt((Math.pow(ellipseLongSemiAxis, 2) + Math.pow(ellipseShortSemiAxis, 2)) / 2);
        return 2 * PINUMBER * sqrtExpression;
    }
}
