package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrganizationConfiguration {

    @Bean
    public Employee getEmployee1(){
        Employee emp = new Employee(getSaleDepartment());
        emp.setEmployeeId(1);
        emp.setEmployeeName("Steve Jobs");
        emp.setEmployeeDOB("24/02/1955");

        return emp;
    }

    @Bean
    public Department getSaleDepartment(){
        return new Department(1, "Sales");
    }
}
