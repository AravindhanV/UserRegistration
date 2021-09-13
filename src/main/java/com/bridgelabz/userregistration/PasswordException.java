package com.bridgelabz.userregistration;

public class PasswordException extends RuntimeException{
	enum ExceptionType {
		PASSWORD_INVALID_SHORT,
		PASSWORD_INVALID_UPPERCASE,
		PASSWORD_INVALID_DIGIT,
		PASSWORD_INVALID_SPECIAL,
		PASSWORD_NULL
	}
	
	ExceptionType type;
	
	public PasswordException(String message, ExceptionType type) {
		super(message);
		this.type = type;
	}
}
