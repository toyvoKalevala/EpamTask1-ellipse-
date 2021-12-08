package com.epam.ellipse.repository.specification;

import com.epam.ellipse.entity.IdentifiableEllipse;

public interface Specification {

    boolean specified(IdentifiableEllipse identifiableEllipse);
}
