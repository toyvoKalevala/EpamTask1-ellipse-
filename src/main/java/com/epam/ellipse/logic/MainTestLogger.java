package com.epam.ellipse.logic;

import com.epam.ellipse.entity.Ellipse;
import com.epam.ellipse.utils.DataException;
import com.epam.ellipse.utils.DataReader;
import com.epam.ellipse.utils.DataValidator;
import org.apache.log4j.Logger;

import java.util.List;

public class MainTestLogger {

    private final static Logger LOGGER = Logger.getLogger(MainTestLogger.class);

    public static void main(String[] args) throws DataException {

        String path = "src/main/resources/data.txt";
        LOGGER.info("The given path is: " + path);
        DataReader dataReader = new DataReader();
        LOGGER.info("DataReader is created");
        DataValidator dataValidator = new DataValidator();
        LOGGER.info("DataValidator is created");
        EllipseCreator ellipseCreator = new EllipseCreator();
        LOGGER.info("EllipseCreator is created");
        Director director = new Director(dataReader, dataValidator, ellipseCreator);
        LOGGER.info("Director is created");
        List<Ellipse> ellipses = director.read(path);
        LOGGER.info("Ellipses list is created");
    }
}
