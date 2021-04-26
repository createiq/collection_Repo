package com.createiq.collections;

import java.util.*;
public class TreeSetDemo {
                           // It is the child of SortedSet
	public static void main(String[] args) {
    TreeSet ts=new TreeSet();// not allows duplicates,heterogeneous(mutiple type) data & null
    
   ts.add("a");//it allows only homogeneous data(same type data)
    
    ts.add("c");
//  ts.add(null);//NullPointerException 
 //ts.add(100);  //ClassCastException
//  ts.add(101);
//  ts.add(102);
  ts.add("z");
  ts.add("b");
  ts.add("b");
    
    System.out.println(ts);
	}

}
