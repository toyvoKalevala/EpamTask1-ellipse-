package com.epam.ellipse.repository.specification;

import com.epam.ellipse.entity.IdentifiableEllipse;
import com.epam.ellipse.logic.Calculator;

public class PerimeterSpecification implements Specification {

    private final double startPerimeter;
    private final double endPerimeter;

    public PerimeterSpecification(double startPerimeter, double endPerimeter) {
        this.startPerimeter = startPerimeter;
        this.endPerimeter = endPerimeter;
    }

    @Override
    public boolean specified(final IdentifiableEllipse ellipse) {
        Calculator calculator = new Calculator();
        double perimeter = calculator.calculatePerimeter(ellipse);
        return perimeter >= startPerimeter && perimeter <= endPerimeter;
    }
}
