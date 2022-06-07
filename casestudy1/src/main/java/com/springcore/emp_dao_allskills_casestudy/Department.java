
package com.springcore.emp_dao_allskills_casestudy;

public class Department {
	
 private int deptno;
 private String dname;
 private int Lcode;
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public int getLcode() {
	return Lcode;
}
public void setLcode(int lcode) {
	Lcode = lcode;
}
public Department(int deptno, String dname, int lcode) {
	super();
	this.deptno = deptno;
	this.dname = dname;
	Lcode = lcode;
}
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Lcode;
	result = prime * result + deptno;
	result = prime * result + ((dname == null) ? 0 : dname.hashCode());
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
	Department other = (Department) obj;
	if (Lcode != other.Lcode)
		return false;
	if (deptno != other.deptno)
		return false;
	if (dname == null) {
		if (other.dname != null)
			return false;
	} else if (!dname.equals(other.dname))
		return false;
	return true;
}
@Override
public String toString() {
	return "Department [deptno=" + deptno + ", dname=" + dname + ", Lcode=" + Lcode + "]";
}
	
 
 
 
 
 
 
 
 
 
 
 
 
}