package com.createiq.collections2;

import java.util.Set;
import java.util.TreeSet;

import objects.Employee;

public class TreeSetDemo {
	
	public static void main(String[] args) {
//		Set<Integer> set = new TreeSet<>();
//		set.add(82);
//		set.add(34);
//		set.add(74);
//		set.add(16);
//		System.out.println(set);
		
//		Set<StringBuffer> set = new TreeSet<>(new StringBufferComparator());
//		set.add(new StringBuffer("Balaji"));  // Balaji
//		set.add(new StringBuffer("Raja"));  //Balaji Raja
//		set.add(new StringBuffer("Ram"));   // Balaji Raja Ram
//		set.add(new StringBuffer("Ajay"));
//		System.out.println(set);
		
//		Set<Integer> set = new TreeSet<>(new NumberComprator());
//		set.add(2);
//		set.add(55);
//		set.add(33);
//		set.add(23);
//		set.add(56);
//		set.add(48);
//		set.add(1);
//		set.add(3);
		
//		System.out.println(set);
		
		
		Set<Employee> employees = new TreeSet<>(new NameEmployeeComparator());
		employees.add(new Employee(1002, "Balaji"));
		employees.add(new Employee(1003, "Rama"));
		employees.add(new Employee(1004, "Ajay"));
		employees.add(new Employee(1001, "Rani"));
		
		System.out.println(employees);
		
		
		
		
	}

}
