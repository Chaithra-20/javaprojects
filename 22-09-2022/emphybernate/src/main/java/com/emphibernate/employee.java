package com.emphibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("employee")
public class employee {
	
	@Id
	private int empId;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + "]";
	}
	


}
