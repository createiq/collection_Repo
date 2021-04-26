package com.createiq.exceptions;

//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.IOException;

public class ExceptionDemo {
	
	public void m1() throws FileNotFoundException {
		
		FileReader fr = new FileReader(" ");
		System.out.println("m1");
	}
	
	
	public void m2() throws FileNotFoundException{
		m1();
		System.out.println("m2");
	
	}
	
	public void m3() throws FileNotFoundException {
		
		m2();
		System.out.println("m3");
		
	}
	
	
	public static void main(String[] args) {
		try {
			new ExceptionDemo().m3();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("finally");
		}
	}

}
