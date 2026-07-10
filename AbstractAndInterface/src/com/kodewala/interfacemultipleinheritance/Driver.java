package com.kodewala.interfacemultipleinheritance;

interface Login {
    default void authenticate()
    {
    	System.out.println("Login.authenticate()");
    }
    
    
}
interface LogOut
{
	default void authenticate()
	{
		System.out.println("LogOut.authenticate()");
	}
}

class GoogleLogin implements Login,LogOut {
	@Override
    public void authenticate() {
       Login.super.authenticate();
    }
}

class EmailLogin implements Login, LogOut {
	@Override
    public void authenticate() {
    	LogOut.super.authenticate();
    }
}


public class Driver {

	public static void main(String[] args) {
		GoogleLogin googleLogin = new GoogleLogin();
		googleLogin.authenticate();
		System.out.println();
		System.out.println("----------------------");
		
		EmailLogin emailLogin = new EmailLogin();
		emailLogin.authenticate();

	}

}
