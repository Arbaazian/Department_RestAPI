package com.codebuffer.SpringBoottutorial.Service;

import java.util.List;
import java.util.Optional;

import com.codebuffer.SpringBoottutorial.Entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> getAllDepartment();

	public Department getDepartmentById(Long deptId);

	public void deleteDepartmentById(long deptId);

	public Department updateDepartment(Long dptId, Department department);

}
