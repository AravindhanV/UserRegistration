/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package UserRegistration;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserRegistrationTest {
    @Test 
    public void validateName_ValidNameInput_True() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateName("Abc");
        assertTrue(result);
    }
    
    @Test 
    public void validateName_InvalidNameInput_False() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateName("AB");
        assertFalse(result);
    }
    
    @Test
    public void validateEmail_ValidEmailInput_True() {
    	UserRegistration userRegistration = new UserRegistration();
    	boolean result = userRegistration.validateEmail("abc.xyz@bl.co.in");
    	assertTrue(result);
    }
    
    @Test
    public void validateEmail_InvalidEmailInput_False() {
    	UserRegistration userRegistration = new UserRegistration();
    	boolean result = userRegistration.validateEmail("abc.xyz");
    	assertFalse(result);
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
}
