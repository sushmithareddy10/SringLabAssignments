package com.cg.employeelistannotationandxmlbased.model;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class SBU {
	
private String sbuCode;
private String sbuName;
private String sbuHead;
@Autowired
List<Employee> empList;



public List<Employee> getEmpList() {
	return empList;
}


public void setEmpList(List<Employee> empList) {
	this.empList = empList;
}


public SBU() {
	super();
}


public String getSbuName() {
	return sbuName;
}
public void setSbuName(String sbuName) {
	this.sbuName = sbuName;
}
public String getSbuHead() {
	return sbuHead;
}
public void setSbuHead(String sbuHead) {
	this.sbuHead = sbuHead;
}

public String getSbuCode() {
	return sbuCode;
}


public void setSbuCode(String sbuCode) {
	this.sbuCode = sbuCode;
}


@Override
public String toString() {
	return "SBU Details[sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "," + empList + "]";
}

}