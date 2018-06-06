package com.odde.baseclasscoupling;

import java.time.LocalDate;

public class LessThanOneYearEmployee extends Employee {

    public double getYearlyBonus()
    {
        DebugHelper.Info("--get yearly bonus--");
        double salary = this.getMonthlySalary();
        DebugHelper.Info(String.format("id:%d, his monthly salary is:%d", getId(), salary));
        return this.workingYear() * salary;
    }

    private double workingYear()
    {
        DebugHelper.Info("--get working year--");

        double year = Math.round(1.0d * LocalDate.now().until(getStartWorkingDate()).getDays() / 365);
        return year > 1 ? 1 : year;
    }
}
