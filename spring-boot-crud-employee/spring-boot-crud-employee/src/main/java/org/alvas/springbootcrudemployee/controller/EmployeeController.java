package org.alvas.springbootcrudemployee.controller;

import org.alvas.springbootcrudemployee.dto.Employee;
import org.alvas.springbootcrudemployee.dto.EmployeeResponse;
import org.alvas.springbootcrudemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
@Autowired	
EmployeeService employeeservice;

	
	@RequestMapping("/getData")
	public String getData() {
		
		
	return "CHAITRA P SHETTY";
		
	}

	@PostMapping("/saveEmployee")
	public  EmployeeResponse<Employee> saveEmployee(@RequestBody Employee employee) {
		return employeeservice.saveEmployee(employee);
		
	}
	@PostMapping("/updateEmployee/{id}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable int  id) {
		return employeeservice.updateEmployee(employee, id);
	}
	

}


