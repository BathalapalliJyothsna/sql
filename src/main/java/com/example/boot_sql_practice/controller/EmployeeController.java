package com.example.boot_sql_practice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot_sql_practice.model.Employee;
import com.example.boot_sql_practice.service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empServ;
	

	
	
	@RequestMapping("/allEmployees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> employees=empServ.getAllEmployees();
		return new ResponseEntity<List<Employee>>(employees,HttpStatus.OK);
	}
	

	
	
	

}

