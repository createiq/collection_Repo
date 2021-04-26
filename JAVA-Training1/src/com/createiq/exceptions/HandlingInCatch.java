package com.createiq.exceptions;

public class HandlingInCatch {

	public static void main(String[] args) {
		System.out.println("hi");
		try {
		System.out.println(10/0);//Risky code
		}
		catch(ArithmeticException e)
		{
			System.out.println(10/2);//Handling code
		}
		
		finally {
			System.out.println("finally 1");
		}
		System.out.println("hello");
	}

}