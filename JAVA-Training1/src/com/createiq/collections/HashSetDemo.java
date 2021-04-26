package com.createiq.collections;

import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
    HashSet hs=new HashSet();
    hs.add(100);
    hs.add("s");
    hs.add("s");//duplicates are not allowed
    hs.add("a");
    hs.add("N");
    hs.add("D");
    hs.add("y");
    hs.add(null);
    hs.add(null);//duplicate nulls not print, it print at first position
    System.out.println(hs);
    
    
	}

}
