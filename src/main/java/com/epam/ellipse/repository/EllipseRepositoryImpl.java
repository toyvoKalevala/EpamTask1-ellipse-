package com.epam.ellipse.repository;

import com.epam.ellipse.entity.IdentifiableEllipse;
import com.epam.ellipse.repository.specification.Specification;

import java.util.*;

public class EllipseRepositoryImpl implements EllipseRepository {

    private Map<Integer, IdentifiableEllipse> store = new HashMap<>();

    @Override
    public void add(IdentifiableEllipse ellipse) {
        store.put(ellipse.getId(), ellipse);
    }

    @Override
    public void delete(IdentifiableEllipse ellipse) {
        store.remove(ellipse.getId());
    }

    @Override
    public void update(IdentifiableEllipse ellipse) {
        store.put(ellipse.getId(), ellipse);
    }

    @Override
    public List<IdentifiableEllipse> query(Specification specification) {
        List<IdentifiableEllipse> ellipses = new ArrayList<>();
        for (IdentifiableEllipse ellipse : store.values()) {
            if (specification.specified(ellipse)) {
                ellipses.add(ellipse);
            }
        }
        return ellipses;
    }

    @Override
    public List<IdentifiableEllipse> sort(Comparator<IdentifiableEllipse> comparator) {
        List<IdentifiableEllipse> ellipsesList = new ArrayList<>(store.values());
        Collections.sort(ellipsesList, comparator);
        return ellipsesList;
    }

    @Override
    public String toString() {
        return "EllipseRepositoryImpl{" +
                "store=" + store.toString() +
                '}';
    }
}
