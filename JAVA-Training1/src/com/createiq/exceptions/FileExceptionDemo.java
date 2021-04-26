package com.createiq.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class FileExceptionDemo {
	public static void m1() {
				System.out.println("I am m1");
				m2();
			}
	
		private static void m2() {
				System.out.println("I am m2");
				m3();
			}
		
		    private static void m3() {
				System.out.println("I am m3");
				int a =0;
				try {
					FileReader fr = new FileReader("j1.txt");
					while((a = fr.read())!= -1) {
						System.out.print((char)a);
					}
				} catch (IOException e) {
					//e.printStackTrace();
					System.err.println(e.toString());
				}
				
			}
		    
			public static void main(String[] args) {
				System.out.println("main");
				
				m1();
			}
			

		}

	


