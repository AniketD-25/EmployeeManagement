package com.example.EmployeeManagement.service;

 

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeManagement.modules.Employee;
import com.example.EmployeeManagement.repository.EmployeeRepository;

 

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	// fetching all employees
	public List<Employee> getAllEmployees(){
		List<Employee> emps = (List<Employee>)employeeRepository.findAll(); 
		return emps;
	}
	
	// fetching employee by id
	public Employee getEmployee(int id){
	Optional<Employee> emp=	employeeRepository.findById(id);
		
		return emp.get();
	}
	
	// inserting employee
	public String addEmployee(Employee e) {
		employeeRepository.save(e);
		
		return "Employee added Successfully";
	}
	
	// updating employee by id
	public String updateEmployee(Employee emp, int id){
		if(id == emp.getEmployeeID()) {
			employeeRepository.save(emp);
		}
		return "Employee Updated Successfully";
	}
	
	// deleting all employees
	public String deleteAllEmployees(){
		employeeRepository.deleteAll();
		
		return "All Employee Deleted Successfully";
	}
	
	// deleting employee by id
	public String deleteEmployeeByID(int id){
		employeeRepository.deleteById(id);
		
		return "Employee Deleted Successfully";
	}
	
	//patching/updating employee by id
	public String patchEmployee(Employee emp, int id) {
		if(id == emp.getEmployeeID()) {
			employeeRepository.save(emp);
			
		}
		return "Employee Updated Successfully";
	}
}
