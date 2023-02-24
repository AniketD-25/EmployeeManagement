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

import com.example.EmployeeManagement.modules.Department;
import com.example.EmployeeManagement.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	// displaying list of all department
		@GetMapping("/departments")
		public List<Department> getAllDepartment(){
			return departmentService.getAllDepartments();
		}

		// displaying department by id
		@GetMapping("/departments/{id}")
		public Department getDepartment(@PathVariable int id){
			return departmentService.getDepartment(id);
		}
		
		// inserting department
		@PostMapping("/departments")
		public String addDepartment(@RequestBody Department department){
			 return departmentService.addDepartment(department);
		}

		//updating department by id
		@PutMapping("/departments/{id}")
		public String updateDepartment(@RequestBody Department d, @PathVariable int id){
		return	departmentService.updateDepartment(d, id);
		}
		
		// deleting all department
		@DeleteMapping("/departments")
		public String deleteAllDepartments(){
			return departmentService.deleteAllDepartment();
		}

		// deleting department by id
		@DeleteMapping("departments/{id}")
		public String deleteDepartmentByID(@RequestBody Department d, @PathVariable int id){
		return	departmentService.deleteDepartmentByID(id);
		}

		// updating/ patching department by id
		@PatchMapping("departments/{id}")
		public String patchDepartmentByID(@RequestBody Department d, @PathVariable int id) {
			return departmentService.patchDepartment(d, id);
		}
}
