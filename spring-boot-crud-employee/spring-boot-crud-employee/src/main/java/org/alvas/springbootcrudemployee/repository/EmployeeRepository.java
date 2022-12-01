package org.alvas.springbootcrudemployee.repository;

import org.alvas.springbootcrudemployee.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	
	

}
