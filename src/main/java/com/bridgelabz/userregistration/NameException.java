package com.bridgelabz.userregistration;

public class NameException extends Exception{
	enum ExceptionType {
		NAME_INVALID,
		NAME_NULL
	}
	
	ExceptionType type;
	
	public NameException(String message, ExceptionType type) {
		super(message);
		this.type = type;
	}
}
