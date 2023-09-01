package org.example;

public class Employee
{
    private String name;
    private String employeeCode;
    private String dateOfBirth;
    private Address address;
    private double salary;

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

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
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

    public void print()
    {
        System.out.printf("Name\t\t\t:\t%s\nEmployee Code\t:\t%s\nDate of birth\t:\t%s\nSalary\t\t\t:\tRs.%.2f\nAddress:\n",
                        getName(), getEmployeeCode(), getDateOfBirth(),getSalary());
        getAddress().print();
    }
}
