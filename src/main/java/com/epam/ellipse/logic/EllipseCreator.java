package com.epam.ellipse.logic;


import com.epam.ellipse.entity.Ellipse;
import com.epam.ellipse.entity.Point;
import org.apache.log4j.Logger;

public class EllipseCreator {

    private static final Logger LOGGER = Logger.getLogger(EllipseCreator.class);
    private static final String DELIMITER = " ";

    public Ellipse create(String line) {

        String[] splitLines = line.split(DELIMITER);

        double x1 = Double.parseDouble(splitLines[0]);
        double y1 = Double.parseDouble(splitLines[1]);
        double x2 = Double.parseDouble(splitLines[2]);
        double y2 = Double.parseDouble(splitLines[3]);

        Point pointOne = new Point(x1, y1);
        LOGGER.info("PointOne is created");
        Point pointTwo = new Point(x2, y2);
        LOGGER.info("PointTwo is created");

        LOGGER.info("Start to create ellipse from " + pointOne.toString() + " and " + pointTwo.toString());
        return new Ellipse(pointOne, pointTwo);
    }
}
