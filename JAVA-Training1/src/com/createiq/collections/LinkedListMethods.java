package com.createiq.collections;

import java.util.LinkedList;
public class LinkedListMethods {

	public static void main(String[] args) {
    LinkedList list=new LinkedList();
    list.add("sandeep");
    list.add("A");
    list.add(11);
    list.add("A");
    list.add(null);
    list.add("zzz");
    System.out.println(list);//[sandeep, A, 11, A, null, zzz]

    list.remove(2);
    System.out.println(list);//[sandeep, A, A, null, zzz]
    
    list.add(0,"aaa");  // add new element this index position in list 
    System.out.println(list);//[aaa, sandeep, A, A, null, zzz]

    
    list.set(1,"bbb");// replacing with new element this index position
    System.out.println(list);//[aaa, bbb, A, A, null, zzz]
    
    list.removeLast();
    System.out.println(list); //[aaa, bbb, A, A, null]  remove last element

    list.addFirst(111);
    System.out.println(list); //[111, aaa, bbb, A, A, null]
    
	}

}
