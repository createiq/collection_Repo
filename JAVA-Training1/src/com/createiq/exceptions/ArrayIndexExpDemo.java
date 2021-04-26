package com.createiq.exceptions;

public class ArrayIndexExpDemo {

	public static void main(String[] args) {
    try {
    	int ch[]=new int[15];
    	ch[16]=50;
	    }
	catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
    System.out.println("rest of the code");

	}

}
