package com.example.EmployeeManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeManagement.modules.Employee;
import com.example.EmployeeManagement.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	// displaying list of all employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployees();
	}

	// displaying employee by id
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id){
		return employeeService.getEmployee(id);
	}
	
	// inserting employee
	@PostMapping("/employees")
	public String addEmployees(@RequestBody Employee employee){
		return employeeService.addEmployee(employee);
	}

	//updating employee by id
	@PutMapping("/employees/{id}")
	public String updateEmployee(@RequestBody Employee e, @PathVariable int id){
		return employeeService.updateEmployee(e, id);
	}
	
	// deleting all employees
	@DeleteMapping("/employees")
	public String deleteAllEmployees(){
		return employeeService.deleteAllEmployees();
	}

	// deleting employee by id
	@DeleteMapping("employees/{id}")
	public String deleteEmployeeByID(@RequestBody Employee e, @PathVariable int id){
	return	employeeService.deleteEmployeeByID(id);
	}

	// updating/ patching employee by id
	@PatchMapping("employees/{id}")
	public String patchEmployeeByID(@RequestBody Employee e, @PathVariable int id) {
		return employeeService.patchEmployee(e, id);
	}
}
