package com.epam.ellipse.entity;

import com.epam.ellipse.logic.Observer;

import java.util.ArrayList;
import java.util.List;

public class IdentifiableEllipse extends Ellipse implements Observable {

    private final Integer id;
    private final List<Observer> observers = new ArrayList<>();

    public IdentifiableEllipse(Integer id, Point pointOne, Point pointTwo) {
        super(pointOne, pointTwo);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public void setPointOne(Point pointOne) {
        super.setPointOne(pointOne);
        this.notifyObservers();
    }

    @Override
    public void setPointTwo(Point pointTwo) {
        super.setPointOne(pointTwo);
        this.notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public String toString() {
        return "IdentifiableEllipse{" +
                "id=" + id + super.getPointOne() + super.getPointTwo() +
                '}';
    }
}
