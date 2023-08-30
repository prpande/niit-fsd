package org.example;

public class Employee
{
    private String name;
    private String employeeCode;
    private String dateOfBirth;
    private double salary;

    public Employee(String name, String employeeCode, String dateOfBirth, double salary)
    {
        this.name = name;
        this.employeeCode = employeeCode;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String getEmployeeCode()
    {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode)
    {
        this.employeeCode = employeeCode;
    }
}
