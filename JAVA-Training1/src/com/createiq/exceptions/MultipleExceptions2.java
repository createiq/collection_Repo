package com.createiq.exceptions;

public class MultipleExceptions2 {

		public static void main(String[] args) {
		try {
			int array[]=new int[10];//array size 10:it store 0-9 values
			array[10]=10/0;
			System.out.println(array[10]);
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
	}
}
