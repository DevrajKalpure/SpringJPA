package com.nt.repositary;

import org.springframework.data.repository.CrudRepository;

import com.nt.user.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
   //no logic
	//jpa handles everything
	//we must create object and use it
}
