package com.createiq.exceptions;

import java.io.FileReader;

import java.io.IOException;


public class FileIOException1 {
	
			public static void m1()
			{
				System.out.println("student1");
				m2();
			}
			private static void m2()
				{
					System.out.println("student2");
					m3();
				}
			private static void m3()
				{ 
				//
				
					int a=0;
					try {
					FileReader fr=new FileReader("j1.txt");
					
					while((a=fr.read())!=-1)
					{
                     
						System.out.print((char)a);
						
					}
				}
					
					catch(IOException e)
					{
					System.err.println(e.toString());
						
					e.printStackTrace();
					}
					
				}
			public static void main(String[] args)
				{
					System.out.println("Main method execute");
					m1();
					
				}
				
			}
		
	
			

