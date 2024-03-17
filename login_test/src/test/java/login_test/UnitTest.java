package login_test;
import org.junit.jupiter.*;
import org.junit.jupiter.api.*;
public class UnitTest {
	LoginMain objLoginMain  = new LoginMain("ankit@accolite.com","Abc@123");
	@Test
	public void test1()
	{
		Assertions.assertEquals(true,objLoginMain.verifyEmail("hello@gmail.in"));
	}
	
	
	@Test
	public void test2()
	{
		Assertions.assertEquals(false,objLoginMain.verifyEmail("hell=o@gmail.in"));
	}
	
	
	@Test
	public void test3()
	{
		Assertions.assertEquals(true,objLoginMain.verifyEmail("hel_400lo@gmail.in"));
	}
	
	
	@Test
	public void test4()
	{
		Assertions.assertEquals(true,objLoginMain.verifyEmail("ankit@accolite.com"));
	}
	
	
	@Test
	public void test5()
	{
		Assertions.assertEquals("Wrong Password",objLoginMain.Login("ankit@accolite.com","null"));
	}
	
	
	@Test
	public void test6()
	{
		Assertions.assertEquals("Email does not Exist!",objLoginMain.Login("ankit@gmail.com","Abc@123"));
	}
	
	
	@Test
	public void test7()
	{
		Assertions.assertEquals("Login Success",objLoginMain.Login("ankit@accolite.com","Abc@123"));
	}
	
	
	@Test
	public void test8()
	{
		Assertions.assertEquals("Invalid Email!",objLoginMain.Login("ankitaccolite.com","Abc@123"));
	}
	
	
	@Test
	public void test9()
	{
		Assertions.assertEquals("Invalid Email!",objLoginMain.ForgotPassword("hell=o@gmail.in"));
	}
	
	
	@Test
	public void test10()
	{
		Assertions.assertEquals("Email does not Exist!",objLoginMain.ForgotPassword("ankit@yahoo.com"));
	}

	@Test
	public void test11()
	{
		Assertions.assertEquals("Email Sent!!",objLoginMain.ForgotPassword("ankit@accolite.com"));
	}
	
	@Test
	public void test12()
	{
		Assertions.assertEquals("Invalid Email!",objLoginMain.ForgotPassword("hello@gmail,com"));
	}
	
	
	@Test
	public void test13()
	{
		Assertions.assertEquals("Email does not Exist!",objLoginMain.Login("hel_400lo@gmail.in","Abc123"));
	}
	
	
	@Test
	public void test14()
	{
		Assertions.assertEquals(false,objLoginMain.verifyEmail("ankit@accolite,com"));
	}
	
	
	@Test
	public void test15()
	{
		Assertions.assertEquals("Password cannot be Empty!",objLoginMain.Login("ankit@accolite.com",""));
	}
	
	
	@Test
	public void test16()
	{
		Assertions.assertEquals("Email cannot be Empty!",objLoginMain.Login("","Abc@123"));
	}
	
	
	@Test
	public void test17()
	{
		Assertions.assertEquals("Invalid Email!",objLoginMain.Login("ankit@accolite","Abc@123"));
	}
	
	
	@Test
	public void test18()
	{
		Assertions.assertEquals(false,objLoginMain.verifyEmail("Abc@123"));
	}
	
	
	@Test
	public void test19()
	{
		Assertions.assertEquals(true,objLoginMain.verifyEmail("ankit00_2_3@gmail.com"));
	}
	
	
	@Test
	public void test20()
	{
		Assertions.assertEquals("Invalid Email!",objLoginMain.ForgotPassword("ankit@.com"));
	}
	
	@Test
	public void test21()
	{
		Assertions.assertEquals("Invalid Email!",objLoginMain.ForgotPassword("ankit@accolite.com."));
	}
}
