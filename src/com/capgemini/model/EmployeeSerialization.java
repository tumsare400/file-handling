package com.capgemini.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialization {
    
	public boolean writeobject(String fileName, Object obj) throws IOException {
		FileOutputStream file = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		out.writeObject(obj);
		out.close();
		
		File files = new File(fileName);
		return files.exists();
		
	}
}
