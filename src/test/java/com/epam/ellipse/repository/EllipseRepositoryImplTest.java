package com.epam.ellipse.repository;

import com.epam.ellipse.entity.IdentifiableEllipse;
import com.epam.ellipse.entity.Point;
import com.epam.ellipse.repository.specification.IdSpecification;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class EllipseRepositoryImplTest {

    public static final Point POINTONE = new Point(1, 2);
    public static final Point POINTTWO = new Point(3, 4);
    public static final Point POINTTHREE = new Point(3, 4);
    public static final Point POINTTFOUR = new Point(3, 4);
    public static final IdentifiableEllipse TEST_ELLIPSE_ONE = new IdentifiableEllipse(1, POINTONE, POINTTWO);
    public static final IdentifiableEllipse TEST_ELLIPSE_TWO = new IdentifiableEllipse(2, POINTTHREE, POINTTFOUR);

    @Test
    public void testQueryShouldReturnRightResult() {
        //when
        EllipseRepositoryImpl repository = new EllipseRepositoryImpl();
        IdSpecification idSpecification = Mockito.mock(IdSpecification.class);
        Mockito.when(idSpecification.specified(TEST_ELLIPSE_ONE)).thenReturn(true);
        Mockito.when(idSpecification.specified(TEST_ELLIPSE_TWO)).thenReturn(false);
        List<IdentifiableEllipse> expectedList = Arrays.asList(TEST_ELLIPSE_ONE);
        repository.add(TEST_ELLIPSE_ONE);
        repository.add(TEST_ELLIPSE_TWO);
        //given
        List<IdentifiableEllipse> actualList = repository.query(idSpecification);
        //then
        Assert.assertEquals(expectedList, actualList);
    }
}
