package org.example;

public class EmployeeImpl
{
    public static void main(String[] args)
    {
        Employee emp = new Employee();
        Manager manager = new Manager();

        Address address = new Address();
        address.setHouseNumber(11);
        address.setStreetName("Marble drive");
        address.setCity("Eville");
        address.setCountry("India");
        address.setZipCode("134131");


        manager.setName("Jane");
        manager.setDateOfBirth("03/03/1999");
        manager.setEmployeeCode("e00123");
        manager.setSalary(3000);
        manager.setAddress(address);

        manager.setTeamSize(3);
        manager.setTeamRatings(2);

        manager.print();

    }

}
