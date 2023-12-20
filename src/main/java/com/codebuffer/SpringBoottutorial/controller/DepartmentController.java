package com.codebuffer.SpringBoottutorial.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codebuffer.SpringBoottutorial.Entity.Department;
import com.codebuffer.SpringBoottutorial.Service.DepartmentService;


import jakarta.validation.Valid;



@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	private final Logger logger = LoggerFactory.getLogger(DepartmentController.class);
	
	
	@PostMapping ("/department")
	public Department saveDepartment(@Valid @RequestBody Department department) {
		
		logger.info("Inside saveDepartment");
		
		     return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/departments")
	public List<Department> getAllDepartment(){
		
		return departmentService.getAllDepartment();
		
	}
	
	@GetMapping("/department/{id}")
	public Department getDepartmentById(@PathVariable ("id") Long deptId) {
		
		logger.info("Inside getDepartmentById");
		
		return departmentService.getDepartmentById(deptId);
	}
	
	@DeleteMapping("/department/{id}")
	public String deleteDepartmentById(@PathVariable("id") long deptId ) {
		
		departmentService.deleteDepartmentById(deptId);
		
		return "Delete by Id";
	}
	
	@PutMapping("/department/{id}")
	public Department updateDepartment(@PathVariable("id") Long dptId ,
			                           @RequestBody Department department    ) {
		
		return departmentService.updateDepartment(dptId , department);
		
	}
	
	@GetMapping ("/department/name/{name}")
	public Department getDepartmentByName(@PathVariable("name") String deptName) {
		
		return departmentService.getDepartmentByName(deptName);
		
		
	}

}
