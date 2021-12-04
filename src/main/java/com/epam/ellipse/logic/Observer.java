package com.epam.ellipse.logic;

import com.epam.ellipse.entity.IdentifiableEllipse;

public interface Observer {

    void update(IdentifiableEllipse identifiableEllipse);
}
