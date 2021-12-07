package com.epam.ellipse.repository.specifications;

import com.epam.ellipse.entity.IdentifiableEllipse;

public interface Specification {

    boolean specified(IdentifiableEllipse identifiableEllipse);
}
