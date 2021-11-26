package com.epam.ellipse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EllipseValidator {

    //Every ellipse is corresponds to this rule: short semi-axis != long semi-axis
    public boolean isEllipse(String line) {

        final String POINTCOORDINATE = "\\d+.\\d+";
        Pattern pattern = Pattern.compile(POINTCOORDINATE);
        Matcher matcher = pattern.matcher(line);

        String coordinate;
        double[] coordinatesArray = new double[4];
        int i = 0;

        while (matcher.find()) {
            coordinate = line.substring(matcher.start(), matcher.end());
            coordinatesArray[i] = Double.parseDouble(coordinate);
            i++;
        }

        double x1 = coordinatesArray[0];
        double x2 = coordinatesArray[2];
        double y1 = coordinatesArray[1];
        double y2 = coordinatesArray[3];

        double ellipseShortSemiAxis = y1 - y2;
        double ellipseLongSemiAxis = x2 - x1;

        return ellipseShortSemiAxis != ellipseLongSemiAxis;
    }
}
