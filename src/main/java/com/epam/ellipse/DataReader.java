package com.epam.ellipse;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public List<String> read(String path) throws DataException {

        List<String> lines = new ArrayList<>();

        File file = new File(path);
        FileReader fileReader;

        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new DataException("File not found, buddy!");
        }

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        try {
            line = bufferedReader.readLine();
            while (line != null) {
                lines.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new DataException("I can't read line, buddy. Sorry :(");
        }

        return lines;

    }
}
