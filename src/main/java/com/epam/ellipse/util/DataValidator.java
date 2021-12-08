package com.epam.ellipse.util;

import org.apache.log4j.Logger;

import java.util.regex.Pattern;

public class DataValidator {

    private static final String VALID_LINE_REGEX = "\\d+\\.\\d+( (-)?\\d+\\.\\d+){3}";
    private static final Logger LOGGER = Logger.getLogger(DataValidator.class);

    public boolean isDataValid(String line) {

        LOGGER.info("Start to validate line " + line);
        return Pattern.matches(VALID_LINE_REGEX, line);
    }
}
