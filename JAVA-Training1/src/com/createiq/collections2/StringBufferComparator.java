package com.createiq.collections2;

import java.util.Comparator;

public class StringBufferComparator implements Comparator<StringBuffer>{

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		System.out.println(o1+" And "+o2 +" Retrun value : "+(o1.toString().compareTo(o2.toString())));
		return o1.toString().compareTo(o2.toString());
	}
	
	

}
