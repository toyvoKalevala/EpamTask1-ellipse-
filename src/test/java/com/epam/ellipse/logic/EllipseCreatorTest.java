package com.epam.ellipse.logic;

import com.epam.ellipse.entity.Ellipse;
import com.epam.ellipse.entity.Point;
import com.epam.ellipse.logic.EllipseCreator;
import org.junit.Assert;
import org.junit.Test;

public class EllipseCreatorTest {

    private static final String VALID_LINE = "1.0 2.0 3.0 4.0";
    private static final Point POINT_1 = new Point(1.0, 2.0);
    private static final Point POINT_2 = new Point(3.0, 4.0);

    private static final EllipseCreator ellipseCreator = new EllipseCreator();

    @Test
    public void testCreateShouldCreateEllipseFromValidLine() {
        //given
        Ellipse expectedEllipse = new Ellipse(POINT_1, POINT_2);
        //when
        Ellipse actualEllipse = ellipseCreator.create(VALID_LINE);
        //then
        Assert.assertEquals(expectedEllipse, actualEllipse);
    }
}
