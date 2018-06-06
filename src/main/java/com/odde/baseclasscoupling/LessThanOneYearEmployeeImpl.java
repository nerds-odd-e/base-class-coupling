package com.odde.baseclasscoupling;

public class LessThanOneYearEmployeeImpl {
    private final LessThanOneYearEmployee lessThanOneYearEmployee;
    private final DebugHelperWrapper debugHelperWrapper;

    public LessThanOneYearEmployeeImpl(LessThanOneYearEmployee lessThanOneYearEmployee, DebugHelperWrapper debugHelperWrapper) {
        this.lessThanOneYearEmployee = lessThanOneYearEmployee;
        this.debugHelperWrapper = debugHelperWrapper;
    }

    public double getYearlyBonus() {
        debugHelperWrapper.info("--get yearly bonus--");
        double salary = lessThanOneYearEmployee.getMonthlySalary();
        debugHelperWrapper.info(String.format("id:%d, his monthly salary is:%f", lessThanOneYearEmployee.getId(), salary));
        return lessThanOneYearEmployee.workingYear() * salary;
    }

}
