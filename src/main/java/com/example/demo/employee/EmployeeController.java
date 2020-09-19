package com.example.demo.employee;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

    //Put your code here
  @GetMapping("/")
	public List<Employee> getEmpList(){
		//Put your code here
		return employeeService.getEmployees();
	}

}
