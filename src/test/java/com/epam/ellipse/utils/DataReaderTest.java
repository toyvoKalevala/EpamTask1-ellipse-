package com.epam.ellipse.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DataReaderTest {

    private static final String VALID_PATH = "src/test/resources/data.txt";
    private static final String INVALID_PATH = "src/test/resources/data1.txt";
    private static final String EXPECTED_LINE_1 = "1.0 1.0 2.0 2.0";
    private static final String EXPECTED_LINE_2 = "2.O 2.0 3.0 4.0";
    private static final String EXPECTED_LINE_3 = " 2.0 3.0 4.0";

    private static final DataReader dataReader = new DataReader();

    @Test
    public void testReadShouldReadLinesFromFile() throws DataException {
        //given
        List<String> expectedLines = Arrays.asList(EXPECTED_LINE_1, EXPECTED_LINE_2, EXPECTED_LINE_3);
        //when
        List<String> actualLines = dataReader.read(VALID_PATH);
        //then
        Assert.assertEquals(expectedLines, actualLines);
    }

    @Test(expected = DataException.class)
    public void testReadShouldThrowDataException() throws DataException {
        //given
        //when
        dataReader.read(INVALID_PATH);
        //then
    }
}
