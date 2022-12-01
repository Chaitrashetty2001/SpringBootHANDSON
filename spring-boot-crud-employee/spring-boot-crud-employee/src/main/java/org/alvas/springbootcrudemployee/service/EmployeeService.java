package org.alvas.springbootcrudemployee.service;

import org.alvas.springbootcrudemployee.EmployeeDao;
import org.alvas.springbootcrudemployee.dto.Employee;
import org.alvas.springbootcrudemployee.dto.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao dao ;
	
	public EmployeeResponse<Employee> saveEmployee(Employee employee) {
		
		EmployeeResponse<Employee>	 employeeResponse = new EmployeeResponse<Employee>();
		
	Employee employee2 =  dao.saveEmployee(employee);
	
	if(employee2 != null) {
		
		employeeResponse.setStatusCode(HttpStatus.CREATED.value());
		employeeResponse.setMsg("Inserted succesfully");
		employeeResponse.setData(employee2);
		return employeeResponse;
	}else {
		return null;
	}
		
	}
	public Employee getById(int  id) {
		return dao.getById( id);
	}
	
	public Employee updateEmployee(Employee employee,int  id) {
		return dao.updateEmployee(employee, id);
	}
	

}
