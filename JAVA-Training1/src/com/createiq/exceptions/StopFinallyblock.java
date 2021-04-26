package com.createiq.exceptions;

public class StopFinallyblock {

	public static void main(String[] args) {
		int x[]= {20,10,8,16,4,};
		try {
		System.out.println(x[5/0]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("this is catch block");
		System.exit(0);
		}
		finally {
//			x[0]=5;
			System.out.println("this is final block....");
		}
	}

}
