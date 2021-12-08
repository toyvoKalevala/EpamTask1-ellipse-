package com.epam.ellipse.logic;

import com.epam.ellipse.entity.IdentifiableEllipse;
import com.epam.ellipse.entity.Parameters;

import java.util.HashMap;
import java.util.Map;

public class EllipseStore implements Observer {

    private EllipseStore() {
    }

    private final Map<Integer, Parameters> parameters = new HashMap<>();
    private final Calculator calculator = new Calculator();

    public void update(IdentifiableEllipse ellipse) {
        double area = calculator.calculateArea(ellipse);
        double perimeter = calculator.calculatePerimeter(ellipse);
        System.out.println("Parameters is changed!");
        parameters.put(ellipse.getId(), new Parameters(area, perimeter));
    }

    private static EllipseStore instance;

    public static EllipseStore getInstance() {
        if (instance == null) {
            instance = new EllipseStore();
        }
        return instance;
    }

    public Map<Integer, Parameters> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return "EllipseStore{" +
                "parameters=" + parameters +
                '}';
    }
}
