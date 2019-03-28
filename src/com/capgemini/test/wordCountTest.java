package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.main.wordCount;

public class wordCountTest {

	private wordCount wcount;
	
	@Test
	public void testWordCountOrNot() throws IOException {
		wcount= new wordCount();
		assertEquals(22,wcount.wordCount("C:\\Java Workspace\\file-handling\\test.txt"));
	}
	public void testFileExist() {
		wcount= new wordCount();
		assertTrue(wcount.FileExistorNot("C:\\Java Workspace\\file-handling\\test.txt"));
	}
	public void testFileisEmpty() {
		wcount= new wordCount();
		
	}
}
