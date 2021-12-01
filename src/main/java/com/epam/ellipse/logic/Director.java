package com.epam.ellipse.logic;

import com.epam.ellipse.entity.Ellipse;
import com.epam.ellipse.utils.DataException;
import com.epam.ellipse.utils.DataReader;
import com.epam.ellipse.utils.DataValidator;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Director {

    private final static Logger LOGGER = Logger.getLogger(Director.class);
    private final DataReader reader;
    private final DataValidator validator;
    private final EllipseCreator creator;

    public Director(DataReader reader, DataValidator validator, EllipseCreator creator) {
        this.reader = reader;
        this.validator = validator;
        this.creator = creator;
    }

    public List<Ellipse> read(String path) throws DataException {
        List<Ellipse> ellipses = new ArrayList<>();
        for (String line : reader.read(path)) {
            if (validator.isDataValid(line)) {
                LOGGER.info("Line is validated");
                Ellipse ellipse = creator.create(line);
                LOGGER.info("Ellipse is created");
                ellipses.add(ellipse);
                LOGGER.info("Ellipse is added to list");
            } else {
                LOGGER.error("Line is invalid!");
            }
        }
        return ellipses;
    }
}
