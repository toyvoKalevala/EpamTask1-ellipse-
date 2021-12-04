package com.epam.ellipse.entity;

import com.epam.ellipse.logic.Observer;

public interface Observable {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();
}
