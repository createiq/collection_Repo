package com.createiq.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(42);
		list.add(8);
		list.add(25);
		list.add(19);
		
		//System.out.println(list);
		Collections.sort(list);//ascending order
		System.out.println(list);
		
		Collections.shuffle(list);//descending order
		System.out.println(list);
		
		Collections.sort(list,new NumberDESComparator());
		System.out.println(list);
	}

}
