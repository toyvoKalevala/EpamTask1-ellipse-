package com.epam.ellipse.repository.specifications;

import com.epam.ellipse.entity.IdentifiableEllipse;

public class IdSpecification implements Specification {

    private final Integer id;

    public IdSpecification(final Integer id) {
        this.id = id;
    }

    @Override
    public boolean specified(final IdentifiableEllipse ellipse) {
        return ellipse.getId().equals(id);
    }
}
