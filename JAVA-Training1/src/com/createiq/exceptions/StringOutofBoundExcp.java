package com.createiq.exceptions;

public class StringOutofBoundExcp {
	public static void main(String[] args) {
		String str="Welcome to java T point";
		System.out.println("String lenth :"+str.length());//string length
		System.out.println("String lenth : "+str.substring(3));//return the remaining part of the string 
		try {
		System.out.println("String lenth : "+str.substring(30));
		}catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("continue program");
		
	}

}
