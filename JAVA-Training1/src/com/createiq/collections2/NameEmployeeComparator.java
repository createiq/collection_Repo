package com.createiq.collections2;

import java.util.Comparator;

import objects.Employee;

public class NameEmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEname().compareTo(o2.getEname());
	}

}
