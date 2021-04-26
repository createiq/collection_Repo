package com.createiq.tasks;

public class Persons {

	private int pid;
	private String pname;

	public Persons(int pid, String pname) //Parameterized constructor
	{

		this.pid = pid;  //this.i==>variable& another id is parameter
		this.pname = pname;
	}

	public int getId() {
		return pid;
	}

	@Override
	public String toString() {
		return "Persons [pid=" + pid + ", pname=" + pname + "]";
	}

	public void setId(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return pname;
	}

	public void setName(String pname) {
		this.pname = pname;
	}
}
