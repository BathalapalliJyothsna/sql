package com.example.boot_sql_practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.boot_sql_practice.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

/*	@Query("select e from Employee e where e.firstName=:name")
	public List<Employee> findByfirstName(@Param("name") String firstName);
	
	@Query("select e from Employee e where e.firstName=:lastname")
	public List<Employee> findBylastName(@Param("lastname") String lastName);

	*/

	

}
