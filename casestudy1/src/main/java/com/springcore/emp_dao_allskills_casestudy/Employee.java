package com.springcore.emp_dao_allskills_casestudy;

import java.util.Date;

public class Employee {

	
	private int empno;
	private String ename;
	private int jcode;
	private int mgrno;
	private Date hiredate;
	private double salary;
	private double commision;
	private int deptNo;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getJcode() {
		return jcode;
	}
	public void setJcode(int jcode) {
		this.jcode = jcode;
	}
	public int getMgrno() {
		return mgrno;
	}
	public void setMgrno(int mgrno) {
		this.mgrno = mgrno;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getCommision() {
		return commision;
	}
	public void setCommision(double commision) {
		this.commision = commision;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public Employee(int empno, String ename, int jcode, int mgrno, Date hiredate, double salary, double commision,
			int deptNo) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.jcode = jcode;
		this.mgrno = mgrno;
		this.hiredate = hiredate;
		this.salary = salary;
		this.commision = commision;
		this.deptNo = deptNo;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(commision);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + deptNo;
		result = prime * result + empno;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + ((hiredate == null) ? 0 : hiredate.hashCode());
		result = prime * result + jcode;
		result = prime * result + mgrno;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(commision) != Double.doubleToLongBits(other.commision))
			return false;
		if (deptNo != other.deptNo)
			return false;
		if (empno != other.empno)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (hiredate == null) {
			if (other.hiredate != null)
				return false;
		} else if (!hiredate.equals(other.hiredate))
			return false;
		if (jcode != other.jcode)
			return false;
		if (mgrno != other.mgrno)
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", jcode=" + jcode + ", mgrno=" + mgrno + ", hiredate="
				+ hiredate + ", salary=" + salary + ", commision=" + commision + ", deptNo=" + deptNo + "]";
	}
	
}
