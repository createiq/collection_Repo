package com.createiq.collections;

import java.util.*;
public class TestArrayList2 {

public static void main(String[] args) {
ArrayList<Integer> list2=new ArrayList<Integer>();
list2.add(1);
list2.add(15);
list2.add(10);
list2.add(2);
System.out.println(list2);
Collections.sort(list2);

for(Integer n:list2)
{
	System.out.println(n);
}
	}

}
