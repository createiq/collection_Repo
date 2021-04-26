package com.createiq.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AraayListAdd {

	public static void main(String[] args) {
    List<String> list=new ArrayList<>();
    list.add("pen");
    list.add("pencil");
    list.add("eraser");
    list.add("scale");
    
    List<String> list2=new ArrayList<>();
    list2.add("book");
    list2.add("notes");
    list2.add("paper");
    list2.add("box");
    
    list2.addAll(list);//adding list with list2
    
    Collections.sort(list2);//sort() method sorting ascending order
    System.out.println(list2);
    
	}

}
