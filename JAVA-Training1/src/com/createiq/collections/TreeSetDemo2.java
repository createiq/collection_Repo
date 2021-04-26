package com.createiq.collections;

//import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {

		TreeSet set = new TreeSet<>();
		set.add("java");
		set.add("sql");
		set.add("python");
    	set.add("jquery");
    	set.add("zspring");//Objects in a TreeSet are stored ascending order.
    	set.add("zspring");//duplicate values are not allowed.
    	

		System.out.println(set);
		
//		set.remove("python");
//		System.out.println(set);
		
		for (Object ele : set) {  //java.util.ConcurrentModificationException
			
			String val = (String) ele;
			if( val == "jquery") {
				set.remove(val);
				System.out.println(set);
			}
		}
		
		}

	}


