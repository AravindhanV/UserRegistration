package com.bridgelabz.userregistration;

public class PhoneException extends Exception{
	enum ExceptionType {
		PHONE_INVALID,
		PHONE_NULL
	}
	
	ExceptionType type;
	
	public PhoneException (String message, ExceptionType type) {
		super(message);
		this.type = type;
	}
}
