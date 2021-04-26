package com.createiq.exceptions;

public class FinallyBlockTest1 {
	
	public static void main(String[] args)   { 
		
		try {
			int i=10/0;
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally {         //finally execute where exception occurs and not handled.
			System.out.println("Finally Block is always Executed...!");
		}
		System.out.println("remaining code !!!");
		
	}
}
