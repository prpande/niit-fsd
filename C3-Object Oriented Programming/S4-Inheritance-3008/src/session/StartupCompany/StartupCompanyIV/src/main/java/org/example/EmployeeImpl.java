package org.example;


public class EmployeeImpl {
    public static void main(String[] args) {

        Manager manager = new Manager("Jane", "e00123", "03/03/1999", 23, 3000, 4, 8);

        // Display Manager details
        System.out.println("The Employee Name   is : " + manager.getEmployeeName());
        System.out.println("The Employee Code   is : " + manager.getEmployeeCode());
        System.out.println("The Employee DOB    is : " + manager.getDob());
        System.out.println("The Employee Age    is : " + manager.getAge());
        System.out.println("The Employee Salary is : " + manager.getSalary());
        System.out.println("The Employee Team Size is    : " + manager.getTeamSize());
        System.out.println("The Employee Team Ratings is : " + manager.getTeamRatings() + " stars");
        System.out.println("The incremented salary : " + manager.calculateIncrement(1.25f));
        ;

        // Display Regional Head details

        RegionalHead regionalHead = new RegionalHead("Tom", "e11009", "03/08/1990", 31, 5000, "South", 5, 8);
        System.out.println("The Employee Name   is : " + regionalHead.getEmployeeName());
        System.out.println("The Employee Code   is : " + regionalHead.getEmployeeCode());
        System.out.println("The Employee DOB    is : " + regionalHead.getDob());
        System.out.println("The Employee Age    is : " + regionalHead.getAge());
        System.out.println("The Employee Salary is : " + regionalHead.getSalary());
        System.out.println("The Employee Region Performance is    : " + regionalHead.getRegionPerformance());
        System.out.println("The Employee Region Ratings is        : " + regionalHead.getReviewRatings() + " stars");
        System.out.println("The incremented salary : " + regionalHead.calculateIncrement(1.25f));
        ;

    }
}
