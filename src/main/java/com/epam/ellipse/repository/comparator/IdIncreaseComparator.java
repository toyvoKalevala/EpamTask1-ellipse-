package com.epam.ellipse.repository.comparator;

import com.epam.ellipse.entity.IdentifiableEllipse;

import java.util.Comparator;

public class IdIncreaseComparator implements Comparator<IdentifiableEllipse> {

    @Override
    public int compare(IdentifiableEllipse ellipseOne, IdentifiableEllipse ellipseTwo) {
        return ellipseOne.getId() - ellipseTwo.getId();
    }
}
