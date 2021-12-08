package com.epam.ellipse.logic;

import com.epam.ellipse.entity.Axis;
import com.epam.ellipse.entity.Ellipse;
import com.epam.ellipse.entity.Point;

public class Calculator {

    private final double PI = 3.14;

    public double calculateArea(Ellipse ellipse) {

        Point pointOne = ellipse.getPointOne();
        Point pointTwo = ellipse.getPointTwo();

        double longSemiAxis = Math.abs(pointTwo.getX() - pointOne.getX());
        double shortSemiAxis = Math.abs(pointOne.getY() - pointTwo.getY());

        return PI * longSemiAxis * shortSemiAxis;
    }

    public double calculatePerimeter(Ellipse ellipse) {

        Point pointOne = ellipse.getPointOne();
        Point pointTwo = ellipse.getPointTwo();

        double longSemiAxis = Math.abs(pointTwo.getX() - pointOne.getX());
        double shortSemiAxis = Math.abs(pointOne.getY() - pointTwo.getY());

        return 2 * PI * Math.sqrt((Math.pow(longSemiAxis, 2) + Math.pow(shortSemiAxis, 2)) / 2);
    }

    public boolean isEllipse(Point pointOne, Point pointTwo) {

        return pointOne.getX() != pointTwo.getX() && pointOne.getY() != pointTwo.getY();
    }

    public boolean isCrossingAxis(Ellipse ellipse, Double distance, Axis axis) {

        boolean isCrossingOneAxis = false;
        double distanceFromZero;
        Point pointOne = ellipse.getPointOne();
        Point pointTwo = ellipse.getPointTwo();

        switch (axis) {
            case OX:
                distanceFromZero = pointTwo.getX();
                if (distanceFromZero == distance) {
                    isCrossingOneAxis = true;
                }
                break;
            case OY:
                distanceFromZero = pointOne.getY();
                if (distanceFromZero == distance) {
                    isCrossingOneAxis = true;
                }
                break;
        }

        return isCrossingOneAxis;
    }


    public boolean isCircle(Point pointOne, Point pointTwo) {

        double longSemiAxis = Math.abs(pointOne.getX() - pointTwo.getX());
        double shortSemiAxis = Math.abs(pointOne.getY() - pointTwo.getY());
        return longSemiAxis == shortSemiAxis;
    }
}
