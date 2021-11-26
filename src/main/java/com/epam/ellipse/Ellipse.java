package com.epam.ellipse;

public class Ellipse {

    private double shortSemiAxis;
    private double longSemiAxis;

    public Ellipse(double shortSemiAxis, double longSemiAxis) {
        this.shortSemiAxis = shortSemiAxis;
        this.longSemiAxis = longSemiAxis;
    }

    public double getShortSemiAxis() {
        return shortSemiAxis;
    }

    public double getLongSemiAxis() {
        return longSemiAxis;
    }

}
