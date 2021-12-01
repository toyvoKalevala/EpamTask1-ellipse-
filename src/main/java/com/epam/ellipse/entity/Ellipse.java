package com.epam.ellipse.entity;

public class Ellipse {

    private final Point pointOne;
    private final Point pointTwo;

    public Ellipse(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    public Point getPointOne() {
        return pointOne;
    }

    public Point getPointTwo() {
        return pointTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ellipse ellipse = (Ellipse) o;
        return pointOne.equals(ellipse.pointOne) && pointTwo.equals(ellipse.pointTwo);
    }
}
