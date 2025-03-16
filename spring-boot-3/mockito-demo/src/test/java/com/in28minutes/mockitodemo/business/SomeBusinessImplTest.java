package com.in28minutes.mockitodemo.business;

import com.in28minutes.mockitodemo.repository.DataService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplTest {

    @Mock
    private DataService dataService;

    @InjectMocks
    private SomeBusinessImpl someBusiness;

    @Test
    void findTheGreatestFromAllData_basicScenario() {
        Mockito.when(dataService.retrieveAllData()).thenReturn(new int[]{2, 25, 15});
        int result = someBusiness.findTheGreatestFromAllData();

        Assertions.assertEquals(25, result);
    }

    @Test
    void findTheGreatestFromAllData_oneValueTest() {
        Mockito.when(dataService.retrieveAllData()).thenReturn(new int[]{2});
        int result = someBusiness.findTheGreatestFromAllData();

        Assertions.assertEquals(2, result);
    }

    @Test
    void findTheGreatestFromAllData_withEmptyArray() {
        Mockito.when(dataService.retrieveAllData()).thenReturn(new int[]{});
        int result = someBusiness.findTheGreatestFromAllData();

        Assertions.assertEquals(Integer.MIN_VALUE, result);
    }
}