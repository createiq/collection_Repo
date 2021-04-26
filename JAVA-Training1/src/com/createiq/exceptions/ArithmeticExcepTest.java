package com.createiq.exceptions;

public class ArithmeticExcepTest {
public static void main(String[] args)
 {
	 try
	 {
		 int value=5/0;
	 }
	 
catch(ArithmeticException e)
	 {
	System.out.println(e);
	 }
     System.out.println("remaining program...!");
 }

}
