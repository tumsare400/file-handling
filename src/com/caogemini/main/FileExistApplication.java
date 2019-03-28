package com.caogemini.main;

import java.io.File;

public class FileExistApplication {
  
	private File file;

	public boolean fileExists(String string) {
		File file = new File(string);
		return file.exists();
	}


	
}
