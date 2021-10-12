package com.revature.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream reader = new FileInputStream("G:\\google.png");
		FileOutputStream writer = new FileOutputStream("G:\\google.png");
	    int character = reader.read();
		        
		while(character != -1) {
			System.out.print((char) character);
		    writer.write(character);
		    character = reader.read();
		        	
		}
		writer.close();
		reader.close();
		        
	}

	

}


