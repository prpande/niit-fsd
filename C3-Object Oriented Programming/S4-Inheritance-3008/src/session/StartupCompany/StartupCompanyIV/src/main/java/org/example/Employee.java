package org.example;

public abstract class Employee {
    private String employeeName;
    private String employeeCode;
    private String dob;
    private int age;
    private double salary;

    public Employee(String employeeName,
                    String employeeCode, String dob,
                    int age, double salary) {
        this.employeeName = employeeName;
        this.employeeCode = employeeCode;
        this.dob = dob;
        this.age = age;
        this.salary = salary;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public String getDob() {
        return dob;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public abstract double calculateIncrement(float hikePercentage);
}

