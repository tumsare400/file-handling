package com.capgemini.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class wordCount {
	
   public int wordCount(String message) throws IOException {
	   
	   int count=0;
	   BufferedReader reader;
	   
	   reader= new BufferedReader(new FileReader(message));
	   String Line;
	   
	   while((Line=reader.readLine())!=null) {
		   if(!(Line.equals(""))) {
			   String[] Wcount=Line.split("\\s+");//count word and spaces
			   count+= Wcount.length;
			    
		   }
	   }
	   reader.close();
	   return count;
   }
   
   public boolean FileExistorNot(String string) {
	   File file = new File(string);
		return file.exists();
   }
  


}
