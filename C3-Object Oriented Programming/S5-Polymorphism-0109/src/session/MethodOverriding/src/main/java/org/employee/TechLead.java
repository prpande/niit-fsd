package org.employee;

public class TechLead extends Employee{

    public TechLead(String empName, float salary, float bonus) {
        super(empName, salary, bonus);
    }

    @Override
    public float calculateSalary() {
        return super.calculateSalary();
    }
}
