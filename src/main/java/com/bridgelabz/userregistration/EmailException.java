package com.bridgelabz.userregistration;

public class EmailException extends RuntimeException{
	enum ExceptionType {
		EMAIL_INVALID,
		EMAIL_NULL
	}
	
	ExceptionType type;
	
	public EmailException(String message, ExceptionType type) {
		super(message);
		this.type = type;
	}
}
