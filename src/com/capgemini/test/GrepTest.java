package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.main.Grep;

public class GrepTest {

	private Grep greps;

	@Test
	public void testStringExistandPrintLineNo() {
		greps = new Grep();
		assertEquals("2.06.0", greps.LineCount("C:\\Java Workspace\\file-handling\\test.txt", "How"));
	}
    @Test
    public void testIfFileNotFound() {
    	greps = new Grep();
    	assertEquals("", greps.LineCount("path", "str"));
    }
    @Test
    public void testIsFileEmpty() {
    	greps = new Grep();
    	assertEquals("",greps.LineCount("C:\\Java Workspace\\file-handling\\test.txt", "xyz"));
    }
}
