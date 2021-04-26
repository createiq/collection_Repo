package com.createiq.collections;

import java.util.*;
//import java.util.Set;

public class EmployeeSet {
	int eid;
	String ename;
	double sal;

	public EmployeeSet(int eid, String ename, double sal) {
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "EmployeeSet [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}

	public static void main(String[] args) {

		HashSet h = new HashSet();
		EmployeeSet e1 = new EmployeeSet(100, "sai", 10000);
		EmployeeSet e2 = new EmployeeSet(101, "bbb", 20000);
		EmployeeSet e3 = new EmployeeSet(102, "ccc", 2500);
		EmployeeSet e4 = new EmployeeSet(103, "ddd", 65000);
		EmployeeSet e5 = new EmployeeSet(104, "eee", 47000);
		EmployeeSet e6 = new EmployeeSet(105, "aaa", 50000);
		EmployeeSet e7 = new EmployeeSet(106, "fff", 10000);
		EmployeeSet e8 = new EmployeeSet(107, "ggg", 14000);
		EmployeeSet e9 = new EmployeeSet(108, "hhh", 19000);
		EmployeeSet e10 = new EmployeeSet(109, "iii", 13000);

		h.add(e1);
		h.add(e2);
		h.add(e3);
		h.add(e4);
		h.add(e5);
		h.add(e6);
		h.add(e7);
		h.add(e8);
		h.add(e9);
		h.add(e10);

		//System.out.println(h);

		Iterator itr = h.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
