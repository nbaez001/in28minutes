package com.in28minutes.mockitodemo.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class ListTest {

    @Test
    void simpleTest() {
        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.size()).thenReturn(3);
        int result = listMock.size();

        Assertions.assertEquals(3, result);
    }

    @Test
    void multipleReturns() {
        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.size()).thenReturn(3).thenReturn(2);

        Assertions.assertEquals(3, listMock.size());
        Assertions.assertEquals(2, listMock.size());
        Assertions.assertEquals(2, listMock.size());
    }

    @Test
    void parameters() {
        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.get(0)).thenReturn("SomeString");

        Assertions.assertEquals("SomeString", listMock.get(0));
        Assertions.assertNull(listMock.get(1));
    }

    @Test
    void genericParameters() {
        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.get(Mockito.anyInt())).thenReturn("SomeString");

        Assertions.assertEquals("SomeString", listMock.get(0));
        Assertions.assertEquals("SomeString", listMock.get(1));
    }
}
