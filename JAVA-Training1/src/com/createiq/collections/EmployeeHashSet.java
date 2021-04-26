package com.createiq.collections;

import java.util.*;

public class EmployeeHashSet {
	private int id;
	private String name;
	private Set<Role> role;
	

	public EmployeeHashSet(int id, String name, Set<Role> role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}

	@Override
	public String toString() {
		return "EmployeeHashSet [id=" + id + ", name=" + name + ", role=" + role + "]";
	}



	public static void main(String[] args) {
		
		Role role=new Role();
		role.setRoleName("Java Developer");
		
		Set<Role> newrole=new HashSet<>();
		newrole.add(role);
		
		
		EmployeeHashSet employee=new EmployeeHashSet(100,"sandeep",newrole);
		System.out.println(employee);

	}

}
