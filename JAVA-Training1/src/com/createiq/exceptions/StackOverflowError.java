package com.createiq.exceptions;

public class StackOverflowError {
	public static void std1()
		{
		System.out.println("student1 is called.");
		std1();
	}
public static void main(String[] args) 
{
	std1();
	
}	
}
