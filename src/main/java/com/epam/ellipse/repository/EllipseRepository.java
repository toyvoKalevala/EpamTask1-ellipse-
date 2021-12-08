package com.epam.ellipse.repository;

import com.epam.ellipse.entity.IdentifiableEllipse;
import com.epam.ellipse.repository.specifications.Specification;

import java.util.Comparator;
import java.util.List;

public interface EllipseRepository {

    void add(IdentifiableEllipse ellipse);

    void delete(IdentifiableEllipse ellipse);

    void update(IdentifiableEllipse ellipse);

    List<IdentifiableEllipse> query(Specification specification);

    List<IdentifiableEllipse> sort(Comparator<IdentifiableEllipse> comparator);
}
