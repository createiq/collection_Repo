package com.createiq.exceptions;

public class InvalidAgeException extends RuntimeException {

	/*public InvalidAgeException()
	{
	super();
	}*/
public InvalidAgeException(String message)
{
	super(message);
}
}
