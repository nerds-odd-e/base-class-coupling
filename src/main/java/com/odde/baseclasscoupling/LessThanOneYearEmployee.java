package com.odde.baseclasscoupling;

import java.time.LocalDate;

public class LessThanOneYearEmployee extends Employee {

    private DebugHelperWrapper debugHelperWrapper = new DebugHelperWrapper();
    private LessThanOneYearEmployeeImpl impl = new LessThanOneYearEmployeeImpl(this, debugHelperWrapper);

    public double getYearlyBonus()
    {
        return impl.getYearlyBonus();
    }

    protected double workingYear()
    {
        debugHelperWrapper.info("--get working year--");

        double year = Math.round(1.0d * LocalDate.now().until(getStartWorkingDate()).getDays() / 365);
        return year > 1 ? 1 : year;
    }
}
