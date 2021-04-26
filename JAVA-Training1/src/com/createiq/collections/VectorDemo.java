package com.createiq.collections;

import java.util.*;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> ve=new Vector<String>();
		ve.add("j");
		ve.add("a");
		ve.add("v");
		ve.add("a");
		System.out.println(ve);
		Collections.sort(ve);
		for(String n:ve) 
			System.out.println(n);
			
			List list2=new Vector<>();
			list2.add(1);
			list2.add(12);
			list2.add(5);
			list2.add(3);
			list2.add(10);
			System.out.println(list2);
			Collections.sort(list2);
			Iterator<Integer> itr=list2.iterator();	
				while (itr.hasNext()) {
              System.out.println(itr.next());					
				}
		}
	}


