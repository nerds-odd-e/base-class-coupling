package com.odde.baseclasscoupling;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BaseClassCouplingTest {
    
    @Test
    public void calculate_lessthanoneyearemployee_bonus() {
        //if my monthly salary is 1200, working year is 0.5, my bonus should be 600
        LessThanOneYearEmployee stubLessThanOneYearEmployee = mock(LessThanOneYearEmployee.class);
        DebugHelperWrapper stubDebugHelper = mock(DebugHelperWrapper.class);
        when(stubLessThanOneYearEmployee.getMonthlySalary()).thenReturn(1200.0);
        when(stubLessThanOneYearEmployee.workingYear()).thenReturn(0.5);
        LessThanOneYearEmployeeImpl impl = new LessThanOneYearEmployeeImpl(stubLessThanOneYearEmployee, stubDebugHelper);

        double actual = impl.getYearlyBonus();

        assertEquals(600, actual, 0.1);
    }
}
