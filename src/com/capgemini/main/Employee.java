package com.capgemini.main;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable{

	private int employeeID;
	private String employeeName;
	private double employeeSalary;

	public Employee() {
		super();

	}

	public Employee(int employeeID, String employeeName, double employeeSalary) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(!(obj instanceof Employee))
			return false;
		Employee employee = (Employee) obj;
		if(this.employeeID == employee.employeeID)
			return true;
		else
		    return false;
		
	}

}
