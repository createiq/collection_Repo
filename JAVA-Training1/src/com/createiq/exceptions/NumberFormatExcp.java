package com.createiq.exceptions;

public class NumberFormatExcp {
	public static void main(String[] args) {
		try {
		String st="sandeep";
	    int x=Integer.parseInt(st);
		}
		catch(NumberFormatException e)
		{
        System.out.println(e);
		}
		System.out.println("remaining program..!");
	}

}
