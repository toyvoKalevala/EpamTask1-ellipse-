package com.epam.ellipse.repository.specification;

import com.epam.ellipse.entity.IdentifiableEllipse;
import com.epam.ellipse.logic.Calculator;

public class AreaSpecification implements Specification {

    private final double startArea;
    private final double endArea;

    public AreaSpecification(double startArea, double endArea) {
        this.startArea = startArea;
        this.endArea = endArea;
    }

    @Override
    public boolean specified(final IdentifiableEllipse ellipse) {
        Calculator calculator = new Calculator();
        double area = calculator.calculateArea(ellipse);
        return area >= startArea && area <= endArea;
    }
}
