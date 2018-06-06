package com.odde.baseclasscoupling;

import java.time.LocalDate;

public abstract class Employee {

    private LocalDate startWorkingDate;

    protected double getMonthlySalary()
    {
        DebugHelper.Info(String.format("query monthly salary id:%d", id));
        return SalaryRepo.get(this.id);
    }

    public abstract double getYearlyBonus();

    private int id;

    public LocalDate getStartWorkingDate() {
        return startWorkingDate;
    }

    public void setStartWorkingDate(LocalDate startWorkingDate) {
        this.startWorkingDate = startWorkingDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
