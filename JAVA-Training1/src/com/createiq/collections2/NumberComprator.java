package com.createiq.collections2;

import java.util.Comparator;

public class NumberComprator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2 - o1;
	}

}
