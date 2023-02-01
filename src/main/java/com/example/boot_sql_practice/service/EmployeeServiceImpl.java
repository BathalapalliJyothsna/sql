package com.example.boot_sql_practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boot_sql_practice.model.Employee;
import com.example.boot_sql_practice.repository.EmployeeRepository;


@Service
public  class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
/*	public Employee saveEmployee(Employee emp) throws EmployeeAlreadyExistsException {
		if(empRepo.existsById(emp.getId()))
			throw new EmployeeAlreadyExistsException();
		
		Employee savedEmp=empRepo.save(emp);
		return savedEmp;
	} */
	
/*	public Employee saveEmployee(Employee emp) throws EmptyException  {
		if(emp.getFirstName().isEmpty())
			throw new EmptyException();
		
		Employee savedEmp=empRepo.save(emp);
		return savedEmp;
	} */
	
/*	public Employee saveEmployee(Employee emp)   {
		
		Employee savedEmp=empRepo.save(emp);
		return savedEmp;
	} */
	
	public List<Employee> getAllEmployees() {
		List<Employee> employees=empRepo.findAll();
		return employees;
	}
	
/*	public Optional<Employee> getEmployeeById(int id) {
		Optional<Employee> emp=empRepo.findById(id);
		return emp;
	}  
	
	
	public String deleteEmployeeById(int id) {
		Optional<Employee> emp= empRepo.findById(id);
		if(emp.isPresent()) {
			empRepo.deleteById(id);
			return "deleted";
		}
		return "id doesn't exist";
	}
	
	public Employee updateEmployeeById(Employee emp) {
		  Employee upemp=empRepo.save(emp);
		  return upemp;
	}
	
	public List<Employee> getEmployeeByfirstName(String firstName) {
		
		
		List<Employee> list=empRepo.findByfirstName(firstName);
		return list;
	}

	
	public List<Employee> getEmployeeBylastName(String lastName) {
		List<Employee> list=empRepo.findBylastName(lastName);
		return list;
	}  */

	
	
	

}
