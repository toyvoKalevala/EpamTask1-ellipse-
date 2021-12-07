package com.epam.ellipse.entity;

public class Ellipse {

    private Point pointOne;
    private Point pointTwo;

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

    public void setPointOne(Point pointOne) {
        this.pointOne = pointOne;
    }

    public void setPointTwo(Point pointTwo) {
        this.pointTwo = pointTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ellipse ellipse = (Ellipse) o;
        return pointOne.equals(ellipse.pointOne) && pointTwo.equals(ellipse.pointTwo);
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "pointOne=" + pointOne +
                ", pointTwo=" + pointTwo +
                '}';
    }
}
