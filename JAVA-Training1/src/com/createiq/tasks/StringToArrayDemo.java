package com.createiq.tasks;

public class StringToArrayDemo {
	public static void main(String[] args) {
			String[] names = {"user1","user2","user2","user2","user3","user3","user3"};
			
			String[] duplicates = new String[names.length];
			System.out.println(duplicates.length);
			int index = 0;
			for(int i=0;i<names.length;i++) {
				for(int j=i+1;j<names.length;j++) {
					if(names[i] == names[j]) {
						boolean flag = false;
						for(int k=0;k<=index;k++) {
							if(duplicates[k] == names[i]) {
								flag= true;
							}
						}
						if(!flag) {
							duplicates[index]  = names[i];
							index++;
						}
					}
				}
			}
			
			for (int i = 0; i < index; i++) {
				System.out.println(duplicates[i]);
			}
		}
}
