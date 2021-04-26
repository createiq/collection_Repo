package com.createiq.collections;

import java.util.Iterator;
import java.util.Stack;

public class StudentStack {
	int sid;
	String sname;
	double fee;

	public StudentStack(int sid, String sname, double fee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "StudentStack [sid=" + sid + ", sname=" + sname + ", fee=" + fee + "]";
	}

	public static void main(String[] args) {
		
		Stack s=new Stack();
		StudentStack s1=new StudentStack(100,"aa",14000);
		StudentStack s2=new StudentStack(101,"bb",1400);
		StudentStack s3=new StudentStack(102,"cc",14100);
		StudentStack s4=new StudentStack(103,"xx",14300);
		StudentStack s5=new StudentStack(104,"yy",14500);
		StudentStack s6=new StudentStack(105,"zz",14000);
		StudentStack s7=new StudentStack(106,"dd",14000);
		StudentStack s8=new StudentStack(107,"ee",14000);
		StudentStack s9=new StudentStack(108,"ff",14000);
		StudentStack s10=new StudentStack(109,"gg",14000);
		s.add(s1);
		s.add(s2);
		s.add(new StudentStack(110,"sss",4522));
		s.add(new StudentStack(102,"cc",1400));
		s.add(new StudentStack(101,"bb",5000));
		
		Iterator itr=s.iterator();
		while (itr.hasNext()) {
       System.out.println(itr.next());			
		}
	}

}
