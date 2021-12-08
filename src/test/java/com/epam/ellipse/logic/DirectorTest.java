package com.epam.ellipse.logic;

import com.epam.ellipse.entity.Ellipse;
import com.epam.ellipse.entity.Point;
import com.epam.ellipse.util.DataException;
import com.epam.ellipse.util.DataReader;
import com.epam.ellipse.util.DataValidator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DirectorTest {

    private static final String TEST_PATH = "testPath";
    private static final String VALID_LINE_1 = "1.0 1.0 2.0 2.0";
    private static final String VALID_LINE_2 = "2.0 2.0 3.0 4.0";
    private static final String INVALID_LINE = "2.o 2.0 3.0 4.0";
    private static final Ellipse VALID_ELLIPSE_1 = new Ellipse(new Point(1.0, 2.0), new Point(3.0, 4.0));
    private static final Ellipse VALID_ELLIPSE_2 = new Ellipse(new Point(5.0, 6.0), new Point(7.0, 8.0));

    @Test
    public void testReadShouldReturnListOfEllipses() throws DataException {
        //given
        DataReader reader = Mockito.mock(DataReader.class);
        List<String> actualLines = Arrays.asList(VALID_LINE_1,VALID_LINE_2);
        Mockito.when(reader.read(TEST_PATH)).thenReturn(actualLines);
        DataValidator validator = Mockito.mock(DataValidator.class);
        Mockito.when(validator.isDataValid(VALID_LINE_1)).thenReturn(true);
        Mockito.when(validator.isDataValid(VALID_LINE_2)).thenReturn(true);
        EllipseCreator creator = Mockito.mock(EllipseCreator.class);
        Mockito.when(creator.create(VALID_LINE_1)).thenReturn(VALID_ELLIPSE_1);
        Mockito.when(creator.create(VALID_LINE_2)).thenReturn(VALID_ELLIPSE_2);
        Director director = new Director(reader, validator, creator);
        List<Ellipse> expectedEllipsesList = Arrays.asList(VALID_ELLIPSE_1, VALID_ELLIPSE_2);
        //when
        List<Ellipse> actualEllipsesList = director.read(TEST_PATH);
        //then
        Assert.assertEquals(expectedEllipsesList, actualEllipsesList);
    }

    @Test
    public void testReadShouldReturnListOfEllipsesAndScipInvalidLines() throws DataException {
        //given
        DataReader reader = Mockito.mock(DataReader.class);
        List<String> actualLines = Arrays.asList(VALID_LINE_1,VALID_LINE_2,INVALID_LINE);
        Mockito.when(reader.read(TEST_PATH)).thenReturn(actualLines);
        DataValidator validator = Mockito.mock(DataValidator.class);
        Mockito.when(validator.isDataValid(VALID_LINE_1)).thenReturn(true);
        Mockito.when(validator.isDataValid(VALID_LINE_2)).thenReturn(true);
        Mockito.when(validator.isDataValid(INVALID_LINE)).thenReturn(false);
        EllipseCreator creator = Mockito.mock(EllipseCreator.class);
        Mockito.when(creator.create(VALID_LINE_1)).thenReturn(VALID_ELLIPSE_1);
        Mockito.when(creator.create(VALID_LINE_2)).thenReturn(VALID_ELLIPSE_2);
        Director director = new Director(reader, validator, creator);
        List<Ellipse> expectedEllipsesList = Arrays.asList(VALID_ELLIPSE_1, VALID_ELLIPSE_2);
        //when
        List<Ellipse> actualEllipsesList = director.read(TEST_PATH);
        //then
        Assert.assertEquals(expectedEllipsesList, actualEllipsesList);
    }
}
