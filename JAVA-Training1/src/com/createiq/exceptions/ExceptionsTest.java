package com.createiq.exceptions;

public class ExceptionsTest {


	public static void main(String[] args) {
//		System.out.println("hi");
//		try {
//		System.out.println(100/0);
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e);
//		}
//        System.out.println("java");	
		
		/*
		 String s=null;
		 try {
		 System.out.println(s.length());
		 }
		 catch(NullPointerException e)
		 {
			System.out.println(e); 
		 }
		 System.out.println("remaining code");
*/	
		/*String s="sandeep";
		try {
		int i=Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
			System.out.println(e);*/
		int x[]=new int[5];
		try {
		 x[10]=12;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
			System.out.println("remaining code");
		}
	}

