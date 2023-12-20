package com.codebuffer.SpringBoottutorial.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long deptId;
	private String deptName;
	private String deptAdress;
	private String deptCode;
	
	
	
	public long getDeptId() {
		return deptId;
	}
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptAdress() {
		return deptAdress;
	}
	public void setDeptAdress(String deptAdress) {
		this.deptAdress = deptAdress;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public Department(long deptId, String deptName, String deptAdress, String deptCode) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptAdress = deptAdress;
		this.deptCode = deptCode;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptAdress=" + deptAdress + ", deptCode="
				+ deptCode + "]";
	}
	
	
	

}
