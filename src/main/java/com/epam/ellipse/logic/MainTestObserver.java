package com.epam.ellipse.logic;

import com.epam.ellipse.entity.IdentifiableEllipse;
import com.epam.ellipse.entity.Point;

public class MainTestObserver {

    public static void main(String[] args) {

        IdentifiableEllipse identifiableEllipse = new IdentifiableEllipse(1, new Point(1, 2), new Point(3, 4));

        EllipseStore store = EllipseStore.getInstance();
        identifiableEllipse.attach(store);

        Calculator calculator = new Calculator();

        System.out.println(calculator.calculateArea(identifiableEllipse));
        System.out.println(calculator.calculatePerimeter(identifiableEllipse));

        identifiableEllipse.setPointOne(new Point(2, 5));

        System.out.println(store.getParameters());

        identifiableEllipse.setPointOne(new Point(1, 2));

        System.out.println(store.getParameters());
    }
}
