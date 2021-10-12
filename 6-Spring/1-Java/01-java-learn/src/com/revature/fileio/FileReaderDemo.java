package com.revature.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		FileReader reader = new FileReader("G:\\file.txt");
        FileWriter writer = new FileWriter("G:\\file-copy.txt");
		int character = reader.read();
        
        while(character != -1) {
        	System.out.print((char) character);
        	writer.write(character);
        	character = reader.read(); 	
        	
        }
        
        /*System.out.println(character);
        System.out.println((char) character);
        character = reader.read();
        System.out.println((char) character);
        System.out.println(character);
        character = reader.read();
        System.out.println(character);
        character = reader.read();
        System.out.println(character);
        character = reader.read();
        System.out.println(character);
        reader.close();*/
        
        writer.close();
        reader.close();
        
	}

}
