package org.employee;

public class Employee {

    private String empName;
    private float salary;
    private float bonus;

    public Employee(String empName, float salary, float bonus) {
        this.empName = empName;
        this.salary = salary;
        this.bonus = bonus;
    }

    public float calculateSalary(){
        float totalSalary = salary + bonus;
        return totalSalary;
    }

}
