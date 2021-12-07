package com.epam.ellipse.repository.comparators;

import com.epam.ellipse.entity.IdentifiableEllipse;
import com.epam.ellipse.entity.Point;

import java.util.Comparator;

public class PointOneYIncreaseComparator implements Comparator<IdentifiableEllipse> {

    @Override
    public int compare(IdentifiableEllipse ellipseOne, IdentifiableEllipse ellipseTwo) {
        Point ellipseOnePointOne = ellipseOne.getPointOne();
        Point ellipseTwoPointOne = ellipseTwo.getPointOne();
        return (int) (ellipseOnePointOne.getY() - ellipseTwoPointOne.getY());
    }
}
