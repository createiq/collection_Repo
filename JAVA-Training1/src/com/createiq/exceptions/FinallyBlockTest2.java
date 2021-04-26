package com.createiq.exceptions;

public class FinallyBlockTest2 {
   public static void main(String[] args) {
       try {
			int x=58/0;
		System.out.println(x);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally {         //finally execute where exception occurs and handled.
			System.out.println("Finally Block is always Executed...!");
		}
		System.out.println("remaining code.................. !!!");
	
}
}
