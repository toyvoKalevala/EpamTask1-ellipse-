package com.epam.ellipse.repository.comparator;

import com.epam.ellipse.entity.IdentifiableEllipse;
import com.epam.ellipse.entity.Point;

import java.util.Comparator;

public class PointOneXDecreaseComparator implements Comparator<IdentifiableEllipse> {

    @Override
    public int compare(IdentifiableEllipse ellipseOne, IdentifiableEllipse ellipseTwo) {
        Point ellipseOnePointOne = ellipseOne.getPointOne();
        Point ellipseTwoPointOne = ellipseTwo.getPointOne();
        return (int) (ellipseTwoPointOne.getX() - ellipseOnePointOne.getX());
    }
}
