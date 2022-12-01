package org.alvas.springbootcrudemployee;

import java.util.Optional;

import org.alvas.springbootcrudemployee.dto.Employee;
import org.alvas.springbootcrudemployee.repository.EmployeeRepository;
import org.hibernate.query.criteria.internal.predicate.IsEmptyPredicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository employeeRepository;
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
		
	}
	public Employee updateEmployee(Employee employee,int  id) {
		
		
	Optional<Employee> optional = 	employeeRepository.findById(id);
	
	if(optional!=null) {
		
		employeeRepository.save(employee);
		
		return employee;
		
	}else {
		return null;
	}
	}
	public Employee getById(int  id) {
		
		
		Optional<Employee> optional = employeeRepository.findById(id);
		
		if(optional.isPresent()) {
			
		
			
			return optional.get();
			
		}else {
			return null;
		}
		}
	
	
	
	

}
