package com.curd.command;

public class EmployeeCommand {
	
	private int sno;
	private int eno;
	private String ename;
	private String job;
	private int deptno;
	private int salary;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "EmployeeCommand [sno=" + sno + ", eno=" + eno + ", ename=" + ename + ", job=" + job + ", deptno="
				+ deptno + ", salary=" + salary + "]";
	}
	
	
}
