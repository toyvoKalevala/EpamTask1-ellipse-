package com.epam.ellipse.utils;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    private static final Logger LOGGER = Logger.getLogger(DataReader.class);

    public List<String> read(String path) throws DataException {

        File file = new File(path);
        FileReader fileReader;

        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            LOGGER.error("When read file:", new DataException("File not found, buddy!"));
            throw new DataException("File not found, buddy!");
        }

        LOGGER.info("File " + path + " is opened");

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<>();

        try {
            String line = bufferedReader.readLine();
            while (line != null) {
                lines.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            LOGGER.error("When read line:", new DataException("Can't read line!"));
            throw new DataException("I can't read line, buddy. Sorry :(");
        }

        LOGGER.info("File " + path + " is read");

        return lines;
    }
}
