package com.createiq.collections;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("s");
	    l.add("l");
	    l.add("d");
	    l.add("v");
	    System.out.println(l);
Iterator<String> itr=l.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());	
}
	}

}
