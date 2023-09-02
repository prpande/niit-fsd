package org.employee;

public class SalesManager extends Employee{

    float commission;

    public SalesManager(String empName, float salary, float bonus, float commission) {
        super(empName, salary, bonus);
        this.commission = commission;
    }

    @Override
    public float calculateSalary() {
        return super.calculateSalary() + commission;

    }

}
