package org.employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new SalesManager("John",35000.0f,3000f,3400f);
        float salesManagerSalary = employee.calculateSalary();
        System.out.println("Sales Manager Salary " + salesManagerSalary);
        Employee employee1 = new TechLead("Johny",34000.0f,2500f);
        float techLeadSalary = employee1.calculateSalary();
        System.out.println("TechLead Salary " + techLeadSalary);
    }
}

