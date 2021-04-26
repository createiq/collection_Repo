package com.createiq.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "sandeep");
		map.put(4, "kishe");
		map.put(3, "naveen");// duplicate values are allowed.
		map.put(2, "naveen");
		map.put(1, 100);// Duplicate keys are not allowed
		map.put(5, null);

		// System.out.println(map);

		Set set = map.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Entry entry = (Entry) itr.next();
			System.out.println("Key:" + entry.getKey()+ "value:" + entry.getValue());

		}
	}

}
