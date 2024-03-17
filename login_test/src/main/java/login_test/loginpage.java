package login_test;

public interface loginpage {
	public String Login(String Email , String pwd);
	public String ForgotPassword(String Email);
	public boolean verifyEmail(String Email);
}
