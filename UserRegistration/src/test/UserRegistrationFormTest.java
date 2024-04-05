package test;
import static org.junit.Assert.*;
import org.junit.Test;
import qa.UserRegistration;
public class UserRegistrationFormTest {

	@Test
	public void testValidAge() {
	UserRegistration form = new UserRegistration();
	assertTrue(form.isAgeValid(18));
	assertTrue(form.isAgeValid(25));
	assertTrue(form.isAgeValid(65));
	}
}
