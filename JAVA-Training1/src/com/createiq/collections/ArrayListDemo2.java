package com.createiq.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
    List<String> list=new ArrayList<>();
    	list.add("mango");
    	list.add("apple");
    	list.add("orange");
    	list.add("pine apple");
    	list.add("water milan");
    	
    //	System.out.println(list);
    	
//    	for(String ele:list)
//    	{
//    		System.out.println(ele);
//    	}
//    	
//    	for(int i=0;i<list.size();i++)
//    	{
//    		System.out.println("Value at Index "+i+" :"+list.get(i));
//    	}
    	
    	ListIterator<String> itr=list.listIterator();
    	while(itr.hasNext())
    	{
    		String ele=itr.next();
    		System.out.println(ele);
    	}
    	System.out.println("-------------------------------------");
    	while (itr.hasPrevious()) {
			String ele =itr.previous();
			System.out.println(ele);
		}
		
    	list.add(2, "grapes");//add element in index 2 position
		System.out.println(list);

    	
	}

}
