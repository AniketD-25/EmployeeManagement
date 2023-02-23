package com.example.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeManagement.modules.Employee;

public interface EmployeeRepository extends JpaRepository<Employee , Integer>{

}
