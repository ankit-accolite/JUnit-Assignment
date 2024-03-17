package login_test;

import java.util.regex.Pattern;

public class LoginMain implements loginpage{
	String myemail;
	String mypsd;
	
	public LoginMain(String myemail, String mypsd) {
		this.myemail = myemail;
		this.mypsd = mypsd;
	}

	@Override
	public String Login(String Email, String pwd) {
		if(Email.length()==0)
			return "Email cannot be Empty!";
		if(!verifyEmail(Email))
			return "Invalid Email!";
		if(pwd.length()==0 && mypsd.length()>0)
			return "Password cannot be Empty!";
				
		if(Email.equals(myemail) && pwd.equals(mypsd))
		{
			System.out.println("User  : "+myemail+" login Sucess !!");
			return "Login Success";
		}
		else if(Email.equals(myemail))
			return "Wrong Password";
		else
			return "Email does not Exist!";
	}

	@Override
	public String ForgotPassword(String Email) {
		if(!verifyEmail(Email))
			return "Invalid Email!";
		if(Email.equals(myemail))
			return "Email Sent!!";
		else
			return "Email does not Exist!";
	}

	@Override
	public boolean verifyEmail(String Email) {
		if(Email.length()<8)	return false;
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"; 
		Pattern pat = Pattern.compile(emailRegex); 
		
		return pat.matcher(Email).matches(); 
	}

}
