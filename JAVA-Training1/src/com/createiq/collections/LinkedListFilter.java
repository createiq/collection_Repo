package com.createiq.collections;

import java.util.*;

public class LinkedListFilter {

	public static void main(String[] args) {
		List list = new LinkedList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("seven");
		list.add("eight");
		System.out.println(list);

		Iterator itr = list.iterator();

		while(itr.hasNext()) {
			String s=(String)itr.next();
			
			if(s.startsWith("s")||s.startsWith("i",1))
			{
				System.out.println(s);
			}
		}
	}

}
