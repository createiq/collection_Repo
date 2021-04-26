package com.createiq.exceptions;

public class MyArrayList {

	private int size;

	private Object arr[];
	
	private int flag = 0;
	
	public MyArrayList(int size) {
		this.size = size;
		arr = new Object[size];
	}

   public void add(Object obj) throws InValidSizeException {
	   if(!(flag<size))
		   throw new InValidSizeException("Index more than size");
	   arr[flag] = obj;
	   flag++;
   }
   
   public Object get(int index) {
	   return arr[index];
   }
}
