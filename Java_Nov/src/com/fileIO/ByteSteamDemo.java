package com.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	 28 dec 24
 * 
 * File :
 * - It is a class
 * - If we want to store the data permanent we use file
 * - We use stream to store data permanent
 * 	 - Stream : It is medium to store data
 * If source has the data destination will have too
 * 
 * 1. Byte stream : 1 Byte/char
 * 		1. FileOutputStream
 * 		   - To write data into the file
 * 		2. FileInputStream
 * 		   - To read data from the file
 * 2. Character stream : 2 Byte/char
 * 		1. FileWriter
 * 		   - To write data into file
 * 		2. FileReader
 * 		   - To read data from the file
 * 
 * Steps:
 * 1. To Open a file into particular class
 * 2. Write/Read into/from the file
 * 3. To close file
 * 
 * Must have error handle
 * IOException
 * FileNotFoundException
 * 
 * 
 * 
 * */

public class ByteSteamDemo {
	public static void main(String[] args) {
		
		try {
			//to create and open file
			FileOutputStream fos=new FileOutputStream("file1.txt",true);
			String str="\n hi there ";
			byte[] b1=str.getBytes();
			//to write data into file
			fos.write(b1);
			//to flush object
			fos.flush();
			//to close the file
			System.out.println("data written...");
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			FileInputStream fis=new FileInputStream("file1.txt");
			int x;
			while ((x=fis.read())!=-1) {
				System.out.print((char)x);
				
			}
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	}

}
