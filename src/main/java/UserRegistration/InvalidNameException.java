package UserRegistration;

public class InvalidNameException extends Exception{
	enum ExceptionType {
		NAME_EMPTY,
		NAME_NULL
	}
	
	ExceptionType type;
	
	public InvalidNameException(String message, ExceptionType type) {
		super(message);
		this.type = type;
	}
}
