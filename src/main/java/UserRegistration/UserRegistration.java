/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package UserRegistration;

import java.util.regex.Pattern;

import UserRegistration.NameException.ExceptionType;

public class UserRegistration {
	public boolean validateName(String name) throws NameException {
		try {
			Pattern pattern;
			pattern = Pattern.compile("^[A-Z][a-z]{2,}");
			if (pattern.matcher(name).matches()) {
				return false;
			} else {
				throw new NameException("Please enter valid name", ExceptionType.NAME_INVALID);
			}
		} catch (NullPointerException e) {
			throw new NameException("Please enter valid name", ExceptionType.NAME_NULL);
		}
	}

	public boolean validateEmail(String email) {
		Pattern pattern = Pattern
				.compile("^abc[a-z0-9]*([+\\-_.][a-z0-9]{3})?@[a-z0-9]+\\.[a-z]{2,3}(\\.[a-z]{2,3})?$");
		return pattern.matcher(email).matches();
	}

	public boolean validatePhone(String phone) {
		Pattern pattern = Pattern.compile("^\\d{1,2}\\s\\d{10}$");
		return pattern.matcher(phone).matches();
	}

	public static boolean validatePassword(String password) {
		Pattern pattern = Pattern.compile(".{7,}");
		if (!pattern.matcher(password).matches()) {
			return false;
		}

		pattern = Pattern.compile(".*[A-Z].*");
		if (!pattern.matcher(password).matches()) {
			return false;
		}

		pattern = Pattern.compile(".*\\d.*");
		if (!pattern.matcher(password).matches()) {
			return false;
		}

		pattern = Pattern.compile("^[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$");
		if (!pattern.matcher(password).matches()) {
			return false;
		}

		return true;
	}
}
