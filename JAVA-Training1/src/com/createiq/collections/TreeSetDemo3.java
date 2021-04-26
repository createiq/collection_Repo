package com.createiq.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		Set<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(123);
		ts.add(55);
		ts.add(89);
		ts.add(21);
		ts.add(6);
		System.out.println(ts);

//		Iterator itr = ts.iterator();
//		while (itr.hasNext()) {
//			Integer in=(Integer)itr.next();
//		
//			ts.remove(6);
//			System.out.println(ts);
for (Object ele : ts) {
			
			Integer val = (Integer) ele;
			if(val == 10) {
				ts.remove(val);
			}
		}
		
		System.out.println(ts);
		
		}
	}

