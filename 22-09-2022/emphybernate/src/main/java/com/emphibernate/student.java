package com.emphibernate;

import java.util.List;

import javax.persistence.Entity; 
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class student {

	@Id
	private int stuId;
	private String stuName;
	private String stuBranch;
	@OneToMany
	@JoinColumn(name="stuId")
	private List<laptop> stuLap;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuBranch() {
		return stuBranch;
	}
	public void setStuBranch(String stuBranch) {
		this.stuBranch = stuBranch;
	}
	public List<laptop> getStuLap() {
		return stuLap;
	}
	public void setStuLap(List<laptop> stuLap) {
		this.stuLap = stuLap;
	}
	@Override
	public String toString() {
		return "student [stuId=" + stuId + ", stuName=" + stuName + ", stuBranch=" + stuBranch + "]";
	}
	
}
