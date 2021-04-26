package com.createiq.collections;

import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		
/*	ArrayList list=new ArrayList(); //creating old non-generic arraylist (before jdk1.5)
	list.add("vinay");
	list.add("sandeep");
	list.add("raju");
	list.add("anvesh");
	System.out.println(list);*/
	
	ArrayList<String> list=new ArrayList<String>();//creating new generic arraylist (since jdk 1.5,it is GENERIC)  
	list.add("sai");
	list.add("ram");
	list.add("ravi");
	list.add("varun");
	System.out.println(list);
	}
}
