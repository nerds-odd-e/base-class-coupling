package com.odde.baseclasscoupling;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class BaseClassCouplingTest {
    
    @Test
    public void calculate_lessthanoneyearemployee_bonus() {
        //if my monthly salary is 1200, working year is 0.5, my bonus should be 600
        LessThanOneYearEmployee lessThanOneYearEmployee = new LessThanOneYearEmployee() {{
            setId(91);
            //Console.WriteLine("your StartDate should be :{0}", DateTime.Today.AddDays(365/2*-1));
            setStartWorkingDate(LocalDate.of(2017, 7, 29));

        }};

        double actual = lessThanOneYearEmployee.getYearlyBonus();
        assertEquals(600, actual, 0.1);
    }
}
