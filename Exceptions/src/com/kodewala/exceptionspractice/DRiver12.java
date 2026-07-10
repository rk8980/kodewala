package com.kodewala.exceptionspractice;

public class DRiver12 {

	public static void main(String[] args) throws FailedToCreateAccountException {
		System.out.println("DRiver12.main() START");
		User user = new User();
		try
		{
			user.createUser();
		}
		catch(UserCreateException e)
		{
			e.printStackTrace();
			System.out.println("Unable to create user, pls support with team");
		}
		System.out.println("DRiver12.main()");

	}
	


}

class Account
{
	public void createAccount() throws FailedToCreateAccountException
	{
		System.out.println("Account.createAccount() Start");
		
		if(true)
		{
			throw new FailedToCreateAccountException("Unable to create default Account");
		}
		
		
		System.out.println("Account.createAccount() END");
	}
	
}


class User
{
	public void createUser() throws UserCreateException, FailedToCreateAccountException
	{
		System.out.println("User.createUser() START");
		
		Account account = new Account();
		
		try
		{
			account.createAccount();
			throw new UserCreateException("Unable to create user");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}