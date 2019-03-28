package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.main.LineCount;

public class LineCountTest {

LineCount lc;
	
	@Test
	public void testFileExists() {	
		lc=new LineCount();
		assertTrue(lc.fileExists("C:\\Java Workspace\\file-handling\\test.txt"));
		
	}

	@Test
	public void testFileNotExists() {
		lc=new LineCount();
		assertFalse(lc.fileExists("C:\\Java Workspace\\file-handling\\test4.txt"));
	}
	
	public void testFileIsEmpty() {
		assertTrue(lc.checkFileIsEmpty("C:\\Java Workspace\\file-handling\\test3.txt")); 
	}
	
	@Test
	public void testLineCount() throws IOException {
		lc=new LineCount();
		assertEquals(8,lc.lineCount("C:\\Java Workspace\\file-handling\\test.txt"));
	}
	
	
}
