package com.example.EmployeeManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeManagement.modules.Department;
import com.example.EmployeeManagement.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	

	// fetching all department
	public List<Department> getAllDepartments(){
		List<Department> depts = (List<Department>)departmentRepository.findAll(); 
		return depts;
	}
	
	// fetching department by id
	public Department getDepartment(int id){
		Optional <Department> dept=departmentRepository.findById(id);
		return dept.get();
	}
	
	// inserting department
	public String addDepartment(Department d) {
		departmentRepository.save(d);
		
		return "Added Successfully";
	}
	
	// updating department by id
	public String updateDepartment(Department d, int id){
		if(id == d.getDepartment_ID()) {
			departmentRepository.save(d);
		}
		return "updated Successfully";
	}
	
	// deleting all departments
	public String deleteAllDepartment(){
		departmentRepository.deleteAll();
		return "All Department Deleted Successfully";
	}
	
	// deleting department by id
	public String deleteDepartmentByID(int id){
		departmentRepository.deleteById(id);
		
		return " Deleted Successfully";
	}
	
	//patching/updating department by id
	public String patchDepartment(Department d, int id) {
		if(id == d.getDepartment_ID()) {
			departmentRepository.save(d);
		}
		return "Updated Successfully"; 
	}
}
