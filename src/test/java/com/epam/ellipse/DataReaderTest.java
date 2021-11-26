package com.epam.ellipse;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReaderTest {

    @Test
    public void testReadShouldReadLinesFromFile() throws DataException {
        //given
        DataReader dataReader = new DataReader();
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("1.0 1.0 2.0 2.0");
        expectedLines.add("2.0 2.0 3.0 4.0");
        //when
        List<String> actualLines = dataReader.read("src/test/resources/data.txt");
        //then
        Assert.assertEquals(expectedLines, actualLines);
    }

    @Test(expected = DataException.class)
    public void testExpectedException() throws DataException {
        //given
        DataReader dataReader = new DataReader();
        //when
        dataReader.read("src/test/resources/data1.txt");
        //then
    }
}
