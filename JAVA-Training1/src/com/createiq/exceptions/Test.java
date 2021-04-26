package com.createiq.exceptions;

public class Test {
	
	public static void demo() {
		System.out.println("Hello World!");
	}
	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList(6);
		
		try {
			myArrayList.add(new Employee(1, "Balaji", 23000.00));
			myArrayList.add(new Employee(2, "Raja", 23000.00));
			myArrayList.add(new Employee(3, "Joy", 23000.00));
			myArrayList.add(new Employee(4, "Test", 23000.00));
			myArrayList.add(new Employee(5, "Abc", 23000.00));
			//myArrayList.add(new Employee());
		} catch (InValidSizeException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println(myArrayList.get(4));
	}
	
	

}
