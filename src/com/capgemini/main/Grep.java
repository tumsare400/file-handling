package com.capgemini.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Grep {

	public String LineCount(String path, String str) {

		double count = 0;
		double countBuffer = 0;
		double countLine = 0;

		String lineNumber = "";
		BufferedReader reader;
		String inputSearch = str;
		String line = "";

		try {
			reader = new BufferedReader(new FileReader(path));
			try {
				while ((line = reader.readLine()) != null) {
					countLine++;
					String[] words = line.split(" ");

					for (String word : words) {
						if (word.equals(inputSearch)) {
							count++;
							countBuffer++;
						}
					}

					if (countBuffer > 0) {
						countBuffer = 0;
						lineNumber += countLine;
					}

				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
       
		return lineNumber;
       
	}
}
