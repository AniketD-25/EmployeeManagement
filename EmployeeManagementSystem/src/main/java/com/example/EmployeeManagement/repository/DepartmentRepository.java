package com.example.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeManagement.modules.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
