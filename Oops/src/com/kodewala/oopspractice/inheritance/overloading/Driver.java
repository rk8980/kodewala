package com.kodewala.oopspractice.inheritance.overloading;
class LoginService
{
	public void doLogin(String mobile, int otp)
	{
		System.out.println("LoginService.doLogin(mobile,otp)");
	}
	public void doLogin(int otp , String mobile)
	{
		System.out.println("LoginService.doLogin(otp, mobile)");
	}
	public void doLogin(String aadhar, int otp,String pan)
	{
		System.out.println("LoginService.doLogin(aadhar, otp, pan)");
	}
}
public class Driver {

	public static void main(String[] args) {
		LoginService loginService = new LoginService();
		loginService.doLogin(1234, "12345678");
		loginService.doLogin("9876543", 4321);
		loginService.doLogin("1234-1654-5678", 890, "IZAPK6299A");
	}

}
