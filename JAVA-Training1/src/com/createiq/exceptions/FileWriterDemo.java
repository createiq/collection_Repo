package com.createiq.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		String s="sandeep chidurala";
		FileWriter fw=null;
		try 
		{
			fw=new FileWriter("b.txt");
			fw.write(s);
			fw.flush();
			fw.close();
			System.out.println("success");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			}
			
			catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		

	}

	
}
