package com.example.demo.employee;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

	public List<Employee> getEmployees() {
        //put your code here.
        List<Employee> employeeList = new ArrayList<Employee>();
        Employee employee = new Employee("Sandhya", 20, 0);
        employeeList.add(employee);
        Employee employee1 = new Employee("Kemp", 24, 2);
        employeeList.add(employee1);
        Employee employee2= new Employee("Anil", 22, 3);
        employeeList.add(employee2);
        Employee employee3 = new Employee("Kumar", 30, 6);
        employeeList.add(employee3);
        Employee employee4 = new Employee("Tim", 32, 7);
        employeeList.add(employee4);
        Collections.sort(employeeList);
        return employeeList;
    }

}
