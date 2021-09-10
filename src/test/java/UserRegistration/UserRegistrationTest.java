/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package UserRegistration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
	private String inputEmail;
	private Boolean expectedOutput;

	public UserRegistrationTest(String email, Boolean output) {
		this.inputEmail = email;
		this.expectedOutput = output;
	}

	@Test
	public void validateName_ValidNameInput_True() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			boolean result = userRegistration.validateName("Abc");
			assertTrue(result);
		} catch (NameException e) {

		}
	}

	@Test
	public void validateName_InvalidNameInput_InvalidNameException() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validateName("AB");
		} catch (NameException e) {
			Assert.assertEquals(NameException.ExceptionType.NAME_INVALID, e.type);
		}
	}
	
	@Test
	public void validateName_NullNameInput_NullNameException() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			userRegistration.validateName(null);
		} catch(NameException e) {
			Assert.assertEquals(NameException.ExceptionType.NAME_NULL, e.type);
		}
	}

	@Test
	public void validateEmail_ValidOrInvalidEmailInput_TrueOrInvalidEmailException() {
		try {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmail(inputEmail);
		assertEquals(expectedOutput, result);
		} catch(EmailException e) {
			Assert.assertEquals(EmailException.ExceptionType.EMAIL_INVALID, e.type);
		}
	}
	
	@Test
	public void validateEmail_NullEmailInput_NullEmailException() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			userRegistration.validateEmail(null);
		} catch(EmailException e) {
			Assert.assertEquals(EmailException.ExceptionType.EMAIL_NULL, e.type);
		}
	}

	@Test
	public void validatePhone_ValidPhoneInput_True() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePhone("91 1234567890");
		assertTrue(result);
	}

	@Test
	public void validatePhone_InvalidPhoneInput_False() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePhone("1234567890");
		assertFalse(result);
	}

	@Test
	public void validatePassword_ShortPassword_False() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePassword("12345");
		assertFalse(result);
	}

	@Test
	public void validatePassword_NoUppercaseInPassword_False() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePassword("12345");
		assertFalse(result);
	}

	@Test
	public void validatePassword_NoDigitInPassword_False() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePassword("abcde");
		assertFalse(result);
	}

	@Test
	public void validatePassword_NoSpecialCharacterInPassword_False() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePassword("abcde");
		assertFalse(result);
	}

	@Test
	public void validatePassword_ManySpecialCharacterInPassword_False() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePassword("ab$c%de");
		assertFalse(result);
	}

	@Test
	public void validatePassword_ValidPassword_True() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePassword("aaaaa4$R");
		assertTrue(result);
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc..2002@gmail.com", false },
				{ "abc.@gmail.com", false }, { "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false },
				{ "abc@gmail.com.aa.au", false } });
	}
}
