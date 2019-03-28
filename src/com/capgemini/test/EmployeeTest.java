package com.capgemini.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.main.Employee;
import com.capgemini.model.EmployeeDeserialization;
import com.capgemini.model.EmployeeSerialization;

public class EmployeeTest {

	private Employee employee; 
	private EmployeeSerialization employeeSerialization;
	private EmployeeDeserialization employeeDeserialization;
	
	@Test 
	public void testEmployeeSerialization() throws IOException {
		employee = new Employee(10, "Jhon", 50000);
		employeeSerialization = new EmployeeSerialization();
		assertTrue(employeeSerialization.writeobject("employee.ser", employee));
	}
	@Test
	public void testEmployeeDeserialization() throws IOException, ClassNotFoundException {
		employee = new Employee(10, "Jhon", 50000);
		employeeDeserialization = new EmployeeDeserialization();
		assertEquals(employee, employeeDeserialization.readObjects("employee.ser"));
	}
}
