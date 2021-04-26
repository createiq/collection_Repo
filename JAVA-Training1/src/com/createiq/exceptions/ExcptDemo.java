package com.createiq.exceptions;

public class ExcptDemo {

	public static void main(String[] args) {
System.out.println("s1");
System.out.println("s2");
System.out.println("s3");
System.out.println("s4");
try {
System.out.println(1/0);
    }
catch(ArithmeticException e)
{
	System.out.println();
	}

finally {
	System.out.println("remaining code");

System.out.println("s5");
System.out.println("s6");
System.out.println("s7");
}
	}

}
