package com.kodewala.oopspractice.oops.abstraction;

class LoginService
{
	public boolean doLogin(String userId, String _pwd)
	{
		connectToDB();
		encryption();
		validateUser();
		promtPasswordreset();
		return true;
	}
	private void connectToDB()
	{
		System.out.println("LoginService.connectToDB()");
	}
	private void encryption()
	{
		System.out.println("LoginService.encryption()");
	}
	private void validateUser()
	{
		System.out.println("LoginService.validateUser()");
	}
	private void promtPasswordreset()
	{
		System.out.println("LoginService.promtPasswordreset()");
	}
}
public class Driver {

	public static void main(String[] args) {
		LoginService loginService = new LoginService();
		loginService.doLogin("1234", "123456");

	}

}
