package com.createiq.tasks;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValuesfind {
	public static void main(String[] args) {
		String[] names={"Emp1","Emp2","Emp4","Emp3","Emp4","Emp1"};
		
		Set<String> dpNames=new HashSet<String>();
		
		/*String[] duplicates = new String[names.length];
	
		System.out.println(duplicates.length);*/
		int Index=0;
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++) {
				
				
				if(names[i]==names[j])
				{
					System.out.println(names[i]);
					dpNames.add(names[i]);
					}
			}
		}
		for(String string:dpNames)
		{
			System.out.println(string);
		}
		}

}
