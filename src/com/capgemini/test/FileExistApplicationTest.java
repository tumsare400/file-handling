package com.capgemini.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.caogemini.main.FileExistApplication;

public class FileExistApplicationTest {

	@Test
	public void testFileExist() {
		FileExistApplication file = new FileExistApplication();
		assertTrue(file.fileExists("C:\\Java Workspace\\file-handling\\test.txt"));

	}
	@Test
	public void testCheckFileNotExist() {
		FileExistApplication file = new FileExistApplication();
		assertFalse(file.fileExists("C:\\Java Workspace\\file-handling\\test2.txt"));

	}	
	
}
