package com.codebuffer.SpringBoottutorial.Service;

import java.util.List;
import java.util.Objects;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.codebuffer.SpringBoottutorial.Entity.Department;
import com.codebuffer.SpringBoottutorial.Repository.DepartmentRepo;

@Service
public class DepatmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepo departmentRepo;

	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepo.save(department);
	}

	@Override
	public List<Department> getAllDepartment() {
		
		return departmentRepo.findAll();
	}

	@Override
	public Department getDepartmentById(Long deptId) {
		
		return departmentRepo.findById(deptId).get();
	}

	@Override
	public void deleteDepartmentById(long deptId) {
	
		departmentRepo.deleteById(deptId);
		
	}

	@Override
	public Department updateDepartment(Long dptId, Department department) {
		
		Department dpt = departmentRepo.findById(dptId).get();
		
		if(Objects.nonNull(department.getDeptName()) &&
				!"".equalsIgnoreCase(department.getDeptName())) {
			
			
		dpt.setDeptName(department.getDeptName());
			
		}
		
		if(Objects.nonNull(department.getDeptAdress()) &&
				!"".equalsIgnoreCase(department.getDeptAdress())) {
			
			
		dpt.setDeptAdress(department.getDeptAdress());
			
		}
		
		if(Objects.nonNull(department.getDeptCode()) &&
				!"".equalsIgnoreCase(department.getDeptCode())) {
			
			
		dpt.setDeptCode(department.getDeptCode());
			
		}
		return departmentRepo.save(dpt);
	}

	@Override
	public Department getDepartmentByName(String deptName) {
		
		return departmentRepo.findByDeptNameIgnoreCase(deptName);
	}
	
	

}
