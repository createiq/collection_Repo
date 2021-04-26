package com.createiq.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {
	
	public static void main(String[] args) {
			
			FileReader fr = null;
			
			try {
				fr = new FileReader("j1.txt");
				int i=-1;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
				
			} catch (FileNotFoundException e) {
				//e.printStackTrace();
				System.out.println(e.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
		}

	}



