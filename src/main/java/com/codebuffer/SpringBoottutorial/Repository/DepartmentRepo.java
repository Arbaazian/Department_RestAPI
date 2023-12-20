package com.codebuffer.SpringBoottutorial.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codebuffer.SpringBoottutorial.Entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {
	
	public Department findByDeptNameIgnoreCase(String deptName);
		
		
	

}
