package com.createiq.exceptions;

public class VoterAppExp1 {
	
	public static boolean castVote(int age) {
		if(age < 18) {
			throw new InvalidAgeException("Age less than 18");
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		try {
			if(castVote(25)) {
				System.out.println("Ok");
			}
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
