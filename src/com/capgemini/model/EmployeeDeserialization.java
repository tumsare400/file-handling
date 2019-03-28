package com.capgemini.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.capgemini.main.Employee;

public class EmployeeDeserialization {
 
	 public Object readObjects(String fileName) throws IOException, ClassNotFoundException {
		 
		 FileInputStream file = new FileInputStream(fileName);
		 ObjectInputStream out = new ObjectInputStream(file);
		 
		 Employee employee = (Employee)out.readObject();
		 return  employee;
	 }
}
