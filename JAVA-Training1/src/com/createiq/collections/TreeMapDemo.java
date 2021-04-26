package com.createiq.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map maps = new TreeMap();

		maps.put(1, "sandeep");
		maps.put(4, "kishe");
		maps.put(3, "naveen");// duplicate values are allowed.
		maps.put(2, "naveen");
		maps.put(1, 100);// Duplicate keys are not allowed,
		// if we can add duplicate keys override with second value.
		maps.put(5, null);

//		Set set = maps.entrySet();
//		Iterator itr = set.iterator();
//
//		while (itr.hasNext()) {
//			Entry entry = (Entry) itr.next();
//			//getKey() -Returns the key corresponding to this entry
//			//getValue() -Returns the value corresponding to this entry
//			System.out.println("Key:" + entry.getKey() + " " + "value:" + entry.getValue());
//		}
	Set keys = maps.keySet();
		// Iterator itr = keys.iterator();

		for (Object ele : keys) {
			// maps.get(); Returns the value to which the specified key is mapped
			System.out.println("keys:" + ele + " " + "Values:" + maps.get(ele));
		}
	}
}
