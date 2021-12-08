package com.epam.ellipse.entity;

public class Parameters {

    private final double area;
    private final double perimeter;

    public Parameters(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Parameters{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
