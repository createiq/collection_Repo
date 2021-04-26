package com.createiq.collections;

import java.util.*;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
    ArrayList<Integer> al=new ArrayList<Integer>();
    al.add(10);
    al.add(100);
    al.add(20);
    al.add(5);
    al.add(25);
    int sum=0;
   // System.out.println(al);
    
//    for(Integer ele:al){
//    
//    sum=ele+sum;
//	}
//    System.out.println(sum);
//    
    Iterator<Integer> iterator = al.iterator();

	while (iterator.hasNext()) {
		sum = sum + iterator.next();

	}

	System.out.println("Sum : " + sum);
	}

}
