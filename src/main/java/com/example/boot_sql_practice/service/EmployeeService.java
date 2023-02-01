package com.example.boot_sql_practice.service;

import java.util.List;
import java.util.Optional;

import com.example.boot_sql_practice.model.Employee;



public interface EmployeeService {
	
//	Employee saveEmployee(Employee emp) throws EmptyException  ;
	List<Employee> getAllEmployees();
/*	Employee saveEmployee(Employee emp) ;
	
	
	Optional<Employee> getEmployeeById(int id);
	
	String  deleteEmployeeById(int id);

	Employee updateEmployeeById(Employee emp);

	

	List<Employee> getEmployeeByfirstName(String firstName);
	List<Employee> getEmployeeBylastName(String lastName);

	*/

}
